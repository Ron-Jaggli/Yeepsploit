package com.fingerprintjs.android.fingerprint.tools.hashers;

import kotlin.text.Charsets;
import kotlin.jvm.internal.Intrinsics;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/hashers/MurMur3x64x128Hasher;", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "()V", "X64_128_C1", "", "X64_128_C2", "fmix64", "kPrev", "hash", "", "data", "hash_x64_128", "", "", "length", "", "seed", "mixK1", "k1Prev", "mixK2", "k2Prev", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class MurMur3x64x128Hasher implements Hasher
{
    private final long X64_128_C1;
    private final long X64_128_C2;
    
    public MurMur3x64x128Hasher() {
        this.X64_128_C1 = -8663945395140668459L;
        this.X64_128_C2 = 5545529020109919103L;
    }
    
    private final long fmix64(long n) {
        n = (n ^ n >>> 33) * -49064778989728563L;
        n = (n ^ n >>> 33) * -4265267296055464877L;
        return n ^ n >>> 33;
    }
    
    private final long[] hash_x64_128(final byte[] array, final int n, long n2) {
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        long n3 = n2;
        long n4 = n2;
        while (wrap.remaining() >= 16) {
            final long long1 = wrap.getLong();
            n2 = wrap.getLong();
            final long rotateLeft = Long.rotateLeft(n4 ^ this.mixK1(long1), 27);
            final long n5 = 5;
            n4 = (rotateLeft + n3) * n5 + 1390208809;
            n3 = (Long.rotateLeft(n3 ^ this.mixK2(n2), 31) + n4) * n5 + 944331445;
        }
        wrap.compact();
        wrap.flip();
        n2 = n4;
        long n6 = n3;
        if (wrap.remaining() > 0) {
            final int remaining = wrap.remaining();
            long n7 = 0L;
            Label_1080: {
                byte b2 = 0;
                Label_1056: {
                    byte b = 0;
                    switch (remaining) {
                        default: {
                            throw new AssertionError((Object)"Code should not reach here!");
                        }
                        case 15: {
                            n7 = (((long)wrap.get(14) & 0xFFL) << 48 ^ ((long)wrap.get(13) & 0xFFL) << 40 ^ ((long)wrap.get(12) & 0xFFL) << 32 ^ ((long)wrap.get(11) & 0xFFL) << 24 ^ ((long)wrap.get(10) & 0xFFL) << 16 ^ ((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 14: {
                            n7 = (((long)wrap.get(13) & 0xFFL) << 40 ^ ((long)wrap.get(12) & 0xFFL) << 32 ^ ((long)wrap.get(11) & 0xFFL) << 24 ^ ((long)wrap.get(10) & 0xFFL) << 16 ^ ((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 13: {
                            n7 = (((long)wrap.get(12) & 0xFFL) << 32 ^ ((long)wrap.get(11) & 0xFFL) << 24 ^ ((long)wrap.get(10) & 0xFFL) << 16 ^ ((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 12: {
                            n7 = (((long)wrap.get(11) & 0xFFL) << 24 ^ ((long)wrap.get(10) & 0xFFL) << 16 ^ ((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 11: {
                            n7 = (((long)wrap.get(10) & 0xFFL) << 16 ^ ((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 10: {
                            n7 = (((long)wrap.get(9) & 0xFFL) << 8 ^ ((long)wrap.get(8) & 0xFFL));
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 9: {
                            n7 = ((long)wrap.get(8) & 0xFFL);
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 8: {
                            n2 = wrap.getLong();
                            break Label_1080;
                        }
                        case 7: {
                            n2 = wrap.get(6);
                            n2 = (((long)wrap.get(5) & 0xFFL) << 40 ^ (n2 & 0xFFL) << 48 ^ ((long)wrap.get(4) & 0xFFL) << 32 ^ ((long)wrap.get(3) & 0xFFL) << 24 ^ ((long)wrap.get(2) & 0xFFL) << 16 ^ ((long)wrap.get(1) & 0xFFL) << 8);
                            b = wrap.get(0);
                            break;
                        }
                        case 6: {
                            n2 = (((long)wrap.get(5) & 0xFFL) << 40 ^ ((long)wrap.get(4) & 0xFFL) << 32 ^ ((long)wrap.get(3) & 0xFFL) << 24 ^ ((long)wrap.get(2) & 0xFFL) << 16 ^ ((long)wrap.get(1) & 0xFFL) << 8);
                            b = wrap.get(0);
                            break;
                        }
                        case 5: {
                            n2 = (((long)wrap.get(4) & 0xFFL) << 32 ^ ((long)wrap.get(3) & 0xFFL) << 24 ^ ((long)wrap.get(2) & 0xFFL) << 16 ^ ((long)wrap.get(1) & 0xFFL) << 8);
                            b = wrap.get(0);
                            break;
                        }
                        case 4: {
                            n2 = (((long)wrap.get(3) & 0xFFL) << 24 ^ ((long)wrap.get(2) & 0xFFL) << 16 ^ ((long)wrap.get(1) & 0xFFL) << 8);
                            b = wrap.get(0);
                            break;
                        }
                        case 3: {
                            n2 = (((long)wrap.get(2) & 0xFFL) << 16 ^ ((long)wrap.get(1) & 0xFFL) << 8);
                            b2 = wrap.get(0);
                            break Label_1056;
                        }
                        case 2: {
                            n2 = ((long)wrap.get(1) & 0xFFL) << 8;
                            b2 = wrap.get(0);
                            break Label_1056;
                        }
                        case 1: {
                            n2 = ((long)wrap.get(0) & 0xFFL);
                            break Label_1080;
                        }
                    }
                    n2 ^= ((long)b & 0xFFL);
                    break Label_1080;
                }
                n2 ^= ((long)b2 & 0xFFL);
            }
            n2 = (n4 ^ this.mixK1(n2));
            n6 = (n3 ^ this.mixK2(n7));
        }
        final long n8 = n;
        final long n9 = n6 ^ n8;
        final long n10 = (n2 ^ n8) + n9;
        n2 = this.fmix64(n10);
        final long fmix64 = this.fmix64(n9 + n10);
        n2 += fmix64;
        return new long[] { n2, fmix64 + n2 };
    }
    
    static /* synthetic */ long[] hash_x64_128$default(final MurMur3x64x128Hasher murMur3x64x128Hasher, final byte[] array, final int n, long n2, final int n3, final Object o) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 0L;
        }
        return murMur3x64x128Hasher.hash_x64_128(array, n, n2);
    }
    
    private final long mixK1(final long n) {
        return Long.rotateLeft(n * this.X64_128_C1, 31) * this.X64_128_C2;
    }
    
    private final long mixK2(final long n) {
        return Long.rotateLeft(n * this.X64_128_C2, 33) * this.X64_128_C1;
    }
    
    @Override
    public String hash(String string) {
        Intrinsics.checkNotNullParameter((Object)string, "data");
        final byte[] bytes = string.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue((Object)bytes, "getBytes(...)");
        final long[] hash_x64_128$default = hash_x64_128$default(this, bytes, string.length(), 0L, 4, null);
        final StringBuilder sb = new StringBuilder();
        for (int length = hash_x64_128$default.length, i = 0; i < length; ++i) {
            sb.append(Long.toHexString(hash_x64_128$default[i]));
        }
        string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString(...)");
        return string;
    }
}
