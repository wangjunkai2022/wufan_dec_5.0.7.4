package io.netty.handler.codec.mqtt;

import io.netty.util.internal.StringUtil;
/* loaded from: classes6.dex */
public final class MqttPublishVariableHeader {
    private final int packetId;
    private final String topicName;

    public MqttPublishVariableHeader(String str, int i4) {
        this.topicName = str;
        this.packetId = i4;
    }

    @Deprecated
    public int messageId() {
        return this.packetId;
    }

    public int packetId() {
        return this.packetId;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[topicName=" + this.topicName + ", packetId=" + this.packetId + ']';
    }

    public String topicName() {
        return this.topicName;
    }
}
