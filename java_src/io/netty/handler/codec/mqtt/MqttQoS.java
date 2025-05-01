package io.netty.handler.codec.mqtt;
/* loaded from: classes6.dex */
public enum MqttQoS {
    AT_MOST_ONCE(0),
    AT_LEAST_ONCE(1),
    EXACTLY_ONCE(2),
    FAILURE(128);
    
    private final int value;

    MqttQoS(int i4) {
        this.value = i4;
    }

    public int value() {
        return this.value;
    }

    public static MqttQoS valueOf(int i4) {
        MqttQoS[] values;
        for (MqttQoS mqttQoS : values()) {
            if (mqttQoS.value == i4) {
                return mqttQoS;
            }
        }
        throw new IllegalArgumentException("invalid QoS: " + i4);
    }
}
