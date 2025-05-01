package io.netty.handler.codec.mqtt;

import io.netty.util.internal.StringUtil;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class MqttUnsubscribePayload {
    private final List<String> topics;

    public MqttUnsubscribePayload(List<String> list) {
        this.topics = Collections.unmodifiableList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringUtil.simpleClassName(this));
        sb.append('[');
        for (int i4 = 0; i4 < this.topics.size(); i4++) {
            sb.append("topicName = ");
            sb.append(this.topics.get(i4));
            sb.append(", ");
        }
        if (!this.topics.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    public List<String> topics() {
        return this.topics;
    }
}
