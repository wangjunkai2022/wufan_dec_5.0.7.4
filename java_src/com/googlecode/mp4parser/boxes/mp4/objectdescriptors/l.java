package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ObjectDescriptorFactory.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    protected static Logger f13978a = Logger.getLogger(l.class.getName());

    /* renamed from: b  reason: collision with root package name */
    protected static Map<Integer, Map<Integer, Class<? extends b>>> f13979b = new HashMap();

    static {
        HashSet<Class<? extends b>> hashSet = new HashSet();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(h.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(i.class);
        hashSet.add(g.class);
        hashSet.add(e.class);
        for (Class<? extends b> cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] tags = descriptor.tags();
            int objectTypeIndication = descriptor.objectTypeIndication();
            Map<Integer, Class<? extends b>> map = f13979b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i4 : tags) {
                map.put(Integer.valueOf(i4), cls);
            }
            f13979b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i4, ByteBuffer byteBuffer) throws IOException {
        b oVar;
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        Map<Integer, Class<? extends b>> map = f13979b.get(Integer.valueOf(i4));
        if (map == null) {
            map = f13979b.get(-1);
        }
        Class<? extends b> cls = map.get(Integer.valueOf(p4));
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                oVar = cls.newInstance();
            } catch (Exception e5) {
                Logger logger = f13978a;
                Level level = Level.SEVERE;
                logger.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i4 + " and tag " + p4, (Throwable) e5);
                throw new RuntimeException(e5);
            }
        } else {
            Logger logger2 = f13978a;
            logger2.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i4) + " and tag " + Integer.toHexString(p4) + " found: " + cls);
            oVar = new o();
        }
        oVar.e(p4, byteBuffer);
        return oVar;
    }
}
