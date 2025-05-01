package io.netty.resolver.dns.macos;

import io.netty.channel.unix.NativeInetAddress;
import java.net.InetSocketAddress;
/* loaded from: classes6.dex */
final class DnsResolver {
    private final String domain;
    private final InetSocketAddress[] nameservers;
    private final String options;
    private final int port;
    private final int searchOrder;
    private final String[] searches;
    private final int timeout;

    DnsResolver(String str, byte[][] bArr, int i4, String[] strArr, String str2, int i5, int i6) {
        this.domain = str;
        if (bArr == null) {
            this.nameservers = new InetSocketAddress[0];
        } else {
            this.nameservers = new InetSocketAddress[bArr.length];
            for (int i7 = 0; i7 < bArr.length; i7++) {
                byte[] bArr2 = bArr[i7];
                this.nameservers[i7] = NativeInetAddress.address(bArr2, 0, bArr2.length);
            }
        }
        this.port = i4;
        this.searches = strArr;
        this.options = str2;
        this.timeout = i5;
        this.searchOrder = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String domain() {
        return this.domain;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InetSocketAddress[] nameservers() {
        return this.nameservers;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String options() {
        return this.options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int port() {
        return this.port;
    }

    int searchOrder() {
        return this.searchOrder;
    }

    String[] searches() {
        return this.searches;
    }

    int timeout() {
        return this.timeout;
    }
}
