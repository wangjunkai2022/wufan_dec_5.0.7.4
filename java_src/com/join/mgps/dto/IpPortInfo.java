package com.join.mgps.dto;

import java.io.Serializable;
import java.net.InetAddress;
/* loaded from: classes4.dex */
public class IpPortInfo implements Serializable {
    InetAddress inetAddress;
    int port;

    public IpPortInfo(InetAddress inetAddress, int i4) {
        this.inetAddress = inetAddress;
        this.port = i4;
    }

    public InetAddress getInetAddress() {
        return this.inetAddress;
    }

    public int getPort() {
        return this.port;
    }

    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    public void setPort(int i4) {
        this.port = i4;
    }
}
