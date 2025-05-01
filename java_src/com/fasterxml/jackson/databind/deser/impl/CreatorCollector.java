package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class CreatorCollector {
    protected static final int C_ARRAY_DELEGATE = 10;
    protected static final int C_BIG_DECIMAL = 6;
    protected static final int C_BIG_INTEGER = 4;
    protected static final int C_BOOLEAN = 7;
    protected static final int C_DEFAULT = 0;
    protected static final int C_DELEGATE = 8;
    protected static final int C_DOUBLE = 5;
    protected static final int C_INT = 2;
    protected static final int C_LONG = 3;
    protected static final int C_PROPS = 9;
    protected static final int C_STRING = 1;
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected SettableBeanProperty[] _delegateArgs;
    protected final boolean _forceAccess;
    protected SettableBeanProperty[] _propertyBasedArgs;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[11];
    protected int _explicitCreators = 0;
    protected boolean _hasNonDefaultCreator = false;

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i4 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i5] == null) {
                    i4 = i5;
                    break;
                } else {
                    i5++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i4);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i4);
            Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
            if (findDeserializer != null) {
                return parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer));
            }
            return annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
        }
        return parameterType;
    }

    private <T extends AnnotatedMember> T _fixAccess(T t4) {
        if (t4 != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t4.getAnnotated(), this._forceAccess);
        }
        return t4;
    }

    protected boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return ClassUtil.isEnumType(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName());
    }

    protected void _reportDuplicateCreator(int i4, boolean z4, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        Object[] objArr = new Object[4];
        objArr[0] = TYPE_DESCS[i4];
        objArr[1] = z4 ? "explicitly marked" : "implicitly discovered";
        objArr[2] = annotatedWithParams;
        objArr[3] = annotatedWithParams2;
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
    }

    public void addBigDecimalCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 6, z4);
    }

    public void addBigIntegerCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 4, z4);
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 7, z4);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z4, SettableBeanProperty[] settableBeanPropertyArr, int i4) {
        if (annotatedWithParams.getParameterType(i4).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 10, z4)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 8, z4)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 5, z4);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 2, z4);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 3, z4);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z4, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (verifyNonDup(annotatedWithParams, 9, z4)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    String name = settableBeanPropertyArr[i4].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i4].getInjectableValueId() == null) && (num = (Integer) hashMap.put(name, Integer.valueOf(i4))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i4), ClassUtil.nameOf(this._beanDesc.getBeanClass())));
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z4) {
        verifyNonDup(annotatedWithParams, 1, z4);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType _computeDelegateType = _computeDelegateType(deserializationContext, this._creators[8], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[10], this._arrayDelegateArgs);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this._beanDesc.getType());
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[8], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[9], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[10], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this._creators[4]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this._creators[6]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[7]);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[8] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[9] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    protected boolean verifyNonDup(AnnotatedWithParams annotatedWithParams, int i4, boolean z4) {
        boolean z5;
        int i5 = 1 << i4;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i4];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i5) == 0) {
                z5 = !z4;
            } else if (!z4) {
                return false;
            } else {
                z5 = true;
            }
            if (z5 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return false;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        _reportDuplicateCreator(i4, z4, annotatedWithParams2, annotatedWithParams);
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                } else {
                    if (!rawParameterType.isAssignableFrom(rawParameterType2)) {
                        _reportDuplicateCreator(i4, z4, annotatedWithParams2, annotatedWithParams);
                    }
                }
            }
        }
        if (z4) {
            this._explicitCreators |= i5;
        }
        this._creators[i4] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
        return true;
    }
}
