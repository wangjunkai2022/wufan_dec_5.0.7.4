package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<JsonNode> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    protected ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    protected JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    protected boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    protected ArrayNode _insert(int i4, JsonNode jsonNode) {
        if (i4 < 0) {
            this._children.add(0, jsonNode);
        } else if (i4 >= this._children.size()) {
            this._children.add(jsonNode);
        } else {
            this._children.add(i4, jsonNode);
        }
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        if (obj == null) {
            addNull();
        } else {
            _add(pojoNode(obj));
        }
        return this;
    }

    public ArrayNode addRawValue(RawValue rawValue) {
        if (rawValue == null) {
            addNull();
        } else {
            _add(rawValueNode(rawValue));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (jsonNode instanceof ArrayNode) {
            ArrayNode arrayNode = (ArrayNode) jsonNode;
            int size = this._children.size();
            if (arrayNode.size() != size) {
                return false;
            }
            List<JsonNode> list = this._children;
            List<JsonNode> list2 = arrayNode._children;
            for (int i4 = 0; i4 < size; i4++) {
                if (!list.get(i4).equals(comparator, list2.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        for (JsonNode jsonNode : this._children) {
            list = jsonNode.findParents(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        for (JsonNode jsonNode : this._children) {
            JsonNode findValue = jsonNode.findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        for (JsonNode jsonNode : this._children) {
            list = jsonNode.findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        for (JsonNode jsonNode : this._children) {
            list = jsonNode.findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i4, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i4, jsonNode);
        return this;
    }

    public ArrayNode insertArray(int i4) {
        ArrayNode arrayNode = arrayNode();
        _insert(i4, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i4) {
        _insert(i4, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i4) {
        ObjectNode objectNode = objectNode();
        _insert(i4, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i4, Object obj) {
        if (obj == null) {
            return insertNull(i4);
        }
        return _insert(i4, pojoNode(obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public boolean isArray() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public JsonNode remove(int i4) {
        if (i4 < 0 || i4 >= this._children.size()) {
            return null;
        }
        return this._children.remove(i4);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i4) {
        if (i4 >= 0 && i4 < this._children.size()) {
            return this._children.get(i4);
        }
        return (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i4), Integer.valueOf(this._children.size()));
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i4 = 0; i4 < size; i4++) {
            ((BaseJsonNode) list.get(i4)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it2 = this._children.iterator();
        while (it2.hasNext()) {
            ((BaseJsonNode) it2.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public JsonNode set(int i4, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i4 >= 0 && i4 < this._children.size()) {
            return this._children.set(i4, jsonNode);
        }
        throw new IndexOutOfBoundsException("Illegal index " + i4 + ", array size " + size());
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this._children.size();
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        for (JsonNode jsonNode : collection) {
            add(jsonNode);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        for (JsonNode jsonNode : this._children) {
            arrayNode._children.add(jsonNode.deepCopy());
        }
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        for (JsonNode jsonNode : this._children) {
            JsonNode findParent = jsonNode.findParent(str);
            if (findParent != null) {
                return (ObjectNode) findParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i4) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i4);
    }

    public ArrayNode add(int i4) {
        _add(numberNode(i4));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i4) {
        if (i4 < 0 || i4 >= this._children.size()) {
            return null;
        }
        return this._children.get(i4);
    }

    public ArrayNode insert(int i4, int i5) {
        _insert(i4, numberNode(i5));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Integer num) {
        if (num == null) {
            return addNull();
        }
        return _add(numberNode(num.intValue()));
    }

    public ArrayNode insert(int i4, Integer num) {
        if (num == null) {
            insertNull(i4);
        } else {
            _insert(i4, numberNode(num.intValue()));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i4) {
        if (i4 >= 0 && i4 < this._children.size()) {
            return this._children.get(i4);
        }
        return MissingNode.getInstance();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    public ArrayNode add(long j4) {
        return _add(numberNode(j4));
    }

    public ArrayNode insert(int i4, long j4) {
        return _insert(i4, numberNode(j4));
    }

    public ArrayNode add(Long l4) {
        if (l4 == null) {
            return addNull();
        }
        return _add(numberNode(l4.longValue()));
    }

    public ArrayNode insert(int i4, Long l4) {
        if (l4 == null) {
            return insertNull(i4);
        }
        return _insert(i4, numberNode(l4.longValue()));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode add(float f5) {
        return _add(numberNode(f5));
    }

    public ArrayNode insert(int i4, float f5) {
        return _insert(i4, numberNode(f5));
    }

    public ArrayNode add(Float f5) {
        if (f5 == null) {
            return addNull();
        }
        return _add(numberNode(f5.floatValue()));
    }

    public ArrayNode insert(int i4, Float f5) {
        if (f5 == null) {
            return insertNull(i4);
        }
        return _insert(i4, numberNode(f5.floatValue()));
    }

    public ArrayNode add(double d5) {
        return _add(numberNode(d5));
    }

    public ArrayNode insert(int i4, double d5) {
        return _insert(i4, numberNode(d5));
    }

    public ArrayNode add(Double d5) {
        if (d5 == null) {
            return addNull();
        }
        return _add(numberNode(d5.doubleValue()));
    }

    public ArrayNode insert(int i4, Double d5) {
        if (d5 == null) {
            return insertNull(i4);
        }
        return _insert(i4, numberNode(d5.doubleValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return addNull();
        }
        return _add(numberNode(bigDecimal));
    }

    public ArrayNode insert(int i4, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return insertNull(i4);
        }
        return _insert(i4, numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        if (bigInteger == null) {
            return addNull();
        }
        return _add(numberNode(bigInteger));
    }

    public ArrayNode insert(int i4, BigInteger bigInteger) {
        if (bigInteger == null) {
            return insertNull(i4);
        }
        return _insert(i4, numberNode(bigInteger));
    }

    public ArrayNode add(String str) {
        if (str == null) {
            return addNull();
        }
        return _add(textNode(str));
    }

    public ArrayNode insert(int i4, String str) {
        if (str == null) {
            return insertNull(i4);
        }
        return _insert(i4, textNode(str));
    }

    public ArrayNode add(boolean z4) {
        return _add(booleanNode(z4));
    }

    public ArrayNode insert(int i4, boolean z4) {
        return _insert(i4, booleanNode(z4));
    }

    public ArrayNode add(Boolean bool) {
        if (bool == null) {
            return addNull();
        }
        return _add(booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i4, Boolean bool) {
        if (bool == null) {
            return insertNull(i4);
        }
        return _insert(i4, booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(byte[] bArr) {
        if (bArr == null) {
            return addNull();
        }
        return _add(binaryNode(bArr));
    }

    public ArrayNode insert(int i4, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i4);
        }
        return _insert(i4, binaryNode(bArr));
    }
}
