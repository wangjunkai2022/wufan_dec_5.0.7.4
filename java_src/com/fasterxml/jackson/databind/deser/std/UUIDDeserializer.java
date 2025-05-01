package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes3.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i4 = 0; i4 < 10; i4++) {
            HEX_DIGITS[i4 + 48] = i4;
        }
        for (int i5 = 0; i5 < 6; i5++) {
            int[] iArr2 = HEX_DIGITS;
            int i6 = i5 + 10;
            iArr2[i5 + 97] = i6;
            iArr2[i5 + 65] = i6;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        JsonParser parser = deserializationContext.getParser();
        throw InvalidFormatException.from(parser, "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    private static int _int(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | (bArr[i4] << BinaryMemcacheOpcodes.FLUSHQ) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    private static long _long(byte[] bArr, int i4) {
        return ((_int(bArr, i4 + 4) << 32) >>> 32) | (_int(bArr, i4) << 32);
    }

    int _badChar(String str, int i4, DeserializationContext deserializationContext, char c5) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c5), Integer.toHexString(c5)));
    }

    int byteFromChars(String str, int i4, DeserializationContext deserializationContext) throws JsonMappingException {
        char charAt = str.charAt(i4);
        int i5 = i4 + 1;
        char charAt2 = str.charAt(i5);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i6 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i6 >= 0) {
                return i6;
            }
        }
        if (charAt <= 127 && HEX_DIGITS[charAt] >= 0) {
            return _badChar(str, i5, deserializationContext, charAt2);
        }
        return _badChar(str, i4, deserializationContext, charAt);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    int intFromChars(String str, int i4, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i4, deserializationContext) << 24) + (byteFromChars(str, i4 + 2, deserializationContext) << 16) + (byteFromChars(str, i4 + 4, deserializationContext) << 8) + byteFromChars(str, i4 + 6, deserializationContext);
    }

    int shortFromChars(String str, int i4, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i4, deserializationContext) << 8) + byteFromChars(str, i4 + 2, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            if (str.length() == 24) {
                return _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext);
            }
            return _badFormat(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            _badFormat(str, deserializationContext);
        }
        int shortFromChars = shortFromChars(str, 24, deserializationContext);
        return new UUID((intFromChars(str, 0, deserializationContext) << 32) + ((shortFromChars(str, 9, deserializationContext) << 16) | shortFromChars(str, 14, deserializationContext)), ((intFromChars(str, 28, deserializationContext) << 32) >>> 32) | ((shortFromChars | (shortFromChars(str, 19, deserializationContext) << 16)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        return (UUID) super._deserializeEmbedded(obj, deserializationContext);
    }
}
