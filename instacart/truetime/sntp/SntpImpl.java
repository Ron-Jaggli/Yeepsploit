package com.instacart.truetime.sntp;

import java.io.IOException;
import com.instacart.truetime.InvalidNtpServerResponseException;
import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import com.instacart.truetime.SntpEventListener;
import java.net.InetAddress;

public class SntpImpl implements Sntp
{
    private static final int INDEX_ORIGINATE_TIME = 24;
    private static final int INDEX_RECEIVE_TIME = 32;
    private static final int INDEX_ROOT_DELAY = 4;
    private static final int INDEX_ROOT_DISPERSION = 8;
    private static final int INDEX_TRANSMIT_TIME = 40;
    private static final int INDEX_VERSION = 0;
    private static final int NTP_MODE = 3;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    public static final int RESPONSE_INDEX_DISPERSION = 5;
    public static final int RESPONSE_INDEX_ORIGINATE_TIME = 0;
    public static final int RESPONSE_INDEX_RECEIVE_TIME = 1;
    public static final int RESPONSE_INDEX_RESPONSE_TICKS = 7;
    public static final int RESPONSE_INDEX_RESPONSE_TIME = 3;
    public static final int RESPONSE_INDEX_ROOT_DELAY = 4;
    public static final int RESPONSE_INDEX_SIZE = 8;
    public static final int RESPONSE_INDEX_STRATUM = 6;
    public static final int RESPONSE_INDEX_TRANSMIT_TIME = 2;
    
    private double doubleMillis(final long n) {
        return n / 65.536;
    }
    
    private long read(final byte[] array, final int n) {
        return ((long)this.ui(array[n]) << 24) + ((long)this.ui(array[n + 1]) << 16) + ((long)this.ui(array[n + 2]) << 8) + this.ui(array[n + 3]);
    }
    
    private long readTimeStamp(final byte[] array, final int n) {
        return (this.read(array, n) - 2208988800L) * 1000L + this.read(array, n + 4) * 1000L / 4294967296L;
    }
    
    private int ui(final byte b) {
        return b & 0xFF;
    }
    
    private void writeNtpVersion(final byte[] array) {
        array[0] = 27;
    }
    
    private void writeTimeStamp(final byte[] array, final int n, long n2) {
        final long n3 = n2 / 1000L;
        final long n4 = n3 + 2208988800L;
        array[n] = (byte)(n4 >> 24);
        array[n + 1] = (byte)(n4 >> 16);
        array[n + 2] = (byte)(n4 >> 8);
        array[n + 3] = (byte)n4;
        n2 = (n2 - n3 * 1000L) * 4294967296L / 1000L;
        array[n + 4] = (byte)(n2 >> 24);
        array[n + 5] = (byte)(n2 >> 16);
        array[n + 6] = (byte)(n2 >> 8);
        array[n + 7] = (byte)(Math.random() * 255.0);
    }
    
    @Override
    public long clockOffset(final long[] array) {
        return (array[1] - array[0] + (array[2] - array[3])) / 2L;
    }
    
    @Override
    public long[] requestTime(final InetAddress inetAddress, final float n, final float n2, final int n3, int soTimeout, final SntpEventListener sntpEventListener) throws IOException {
        synchronized (this) {
            sntpEventListener.sntpRequest(inetAddress);
            final DatagramSocket datagramSocket = null;
            Object o2;
            Object o = o2 = null;
            try {
                try {
                    o2 = o;
                    final DatagramSocket datagramSocket2 = new DatagramSocket();
                    try {
                        datagramSocket2.setSoTimeout(soTimeout);
                        o2 = new byte[48];
                        o = new DatagramPacket((byte[])o2, 48, inetAddress, 123);
                        this.writeNtpVersion((byte[])o2);
                        final long currentTimeMillis = System.currentTimeMillis();
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        this.writeTimeStamp((byte[])o2, 40, currentTimeMillis);
                        datagramSocket2.send((DatagramPacket)o);
                        o = new DatagramPacket((byte[])o2, 48);
                        datagramSocket2.receive((DatagramPacket)o);
                        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        final long timeStamp = this.readTimeStamp((byte[])o2, 24);
                        final long timeStamp2 = this.readTimeStamp((byte[])o2, 32);
                        final long timeStamp3 = this.readTimeStamp((byte[])o2, 40);
                        final long n4 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
                        final long read = this.read((byte[])o2, 4);
                        final double doubleMillis = this.doubleMillis(read);
                        if (doubleMillis > n) {
                            o2 = new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_delay", (float)doubleMillis, n);
                            throw o2;
                        }
                        final long read2 = this.read((byte[])o2, 8);
                        final double doubleMillis2 = this.doubleMillis(read2);
                        if (doubleMillis2 > n2) {
                            o2 = new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_dispersion", (float)doubleMillis2, n2);
                            throw o2;
                        }
                        soTimeout = o2[0];
                        final byte b = (byte)(soTimeout & 0x7);
                        if (b != 4 && b != 5) {
                            o2 = new(com.instacart.truetime.InvalidNtpServerResponseException.class)();
                            o = new StringBuilder("untrusted mode value for TrueTime: ");
                            new InvalidNtpServerResponseException(((StringBuilder)o).append((int)b).toString());
                            throw o2;
                        }
                        final int n5 = o2[1] & 0xFF;
                        final long n6 = n5;
                        if (n5 < 1 || n5 > 15) {
                            o = new(com.instacart.truetime.InvalidNtpServerResponseException.class)();
                            o2 = new StringBuilder("untrusted stratum value for TrueTime: ");
                            new InvalidNtpServerResponseException(((StringBuilder)o2).append(n5).toString());
                            throw o;
                        }
                        if ((byte)(soTimeout >> 6 & 0x3) == 3) {
                            o2 = new InvalidNtpServerResponseException("unsynchronized server responded for TrueTime");
                            throw o2;
                        }
                        final double n7 = (double)Math.abs(n4 - timeStamp - (timeStamp3 - timeStamp2));
                        if (n7 >= n3) {
                            o2 = new InvalidNtpServerResponseException("%s too large for comfort %f [actual] >= %f [expected]", "server_response_delay", (float)n7, (float)n3);
                            throw o2;
                        }
                        final long abs = Math.abs(timeStamp - System.currentTimeMillis());
                        if (abs < 10000L) {
                            sntpEventListener.sntpRequestSuccessful(inetAddress);
                            datagramSocket2.close();
                            monitorexit(this);
                            return new long[] { timeStamp, timeStamp2, timeStamp3, n4, read, read2, n6, elapsedRealtime2 };
                        }
                        o = new(com.instacart.truetime.InvalidNtpServerResponseException.class)();
                        o2 = new StringBuilder("Request was sent more than 10 seconds back ");
                        new InvalidNtpServerResponseException(((StringBuilder)o2).append(abs).toString());
                        throw o;
                    }
                    catch (final Exception o) {}
                    finally {
                        o2 = datagramSocket2;
                    }
                }
                finally {}
            }
            catch (final Exception o) {
                final DatagramSocket datagramSocket2 = datagramSocket;
            }
            sntpEventListener.sntpRequestFailed(inetAddress, (Exception)o);
            throw o;
            if (o2 != null) {
                ((DatagramSocket)o2).close();
            }
        }
    }
    
    @Override
    public long roundTripDelay(final long[] array) {
        return array[3] - array[0] - (array[2] - array[1]);
    }
    
    @Override
    public long timeSinceBoot(final long[] array) {
        return array[7];
    }
    
    @Override
    public long trueTime(final long[] array) {
        return array[3] + this.clockOffset(array);
    }
}
