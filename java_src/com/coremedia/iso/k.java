package com.coremedia.iso;

import com.coremedia.iso.boxes.k1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PropertyBoxParserImpl.java */
/* loaded from: classes2.dex */
public class k extends a {

    /* renamed from: h  reason: collision with root package name */
    static String[] f10043h = new String[0];

    /* renamed from: c  reason: collision with root package name */
    Properties f10044c;

    /* renamed from: d  reason: collision with root package name */
    Pattern f10045d = Pattern.compile("(.*)\\((.*?)\\)");

    /* renamed from: e  reason: collision with root package name */
    StringBuilder f10046e = new StringBuilder();

    /* renamed from: f  reason: collision with root package name */
    String f10047f;

    /* renamed from: g  reason: collision with root package name */
    String[] f10048g;

    public k(String... strArr) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/isoparser-default.properties");
        try {
            Properties properties = new Properties();
            this.f10044c = properties;
            try {
                properties.load(resourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    InputStream openStream = resources.nextElement().openStream();
                    try {
                        this.f10044c.load(openStream);
                        openStream.close();
                    } catch (Throwable th) {
                        openStream.close();
                        throw th;
                    }
                }
                for (String str : strArr) {
                    this.f10044c.load(getClass().getResourceAsStream(str));
                }
                try {
                    resourceAsStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th2;
        }
    }

    @Override // com.coremedia.iso.a
    public com.coremedia.iso.boxes.d b(String str, byte[] bArr, String str2) {
        c(str, bArr, str2);
        try {
            Class<?> cls = Class.forName(this.f10047f);
            String[] strArr = this.f10048g;
            if (strArr.length > 0) {
                Class<?>[] clsArr = new Class[strArr.length];
                Object[] objArr = new Object[strArr.length];
                int i4 = 0;
                while (true) {
                    String[] strArr2 = this.f10048g;
                    if (i4 >= strArr2.length) {
                        return (com.coremedia.iso.boxes.d) cls.getConstructor(clsArr).newInstance(objArr);
                    }
                    if ("userType".equals(strArr2[i4])) {
                        objArr[i4] = bArr;
                        clsArr[i4] = byte[].class;
                    } else if ("type".equals(this.f10048g[i4])) {
                        objArr[i4] = str;
                        clsArr[i4] = String.class;
                    } else if ("parent".equals(this.f10048g[i4])) {
                        objArr[i4] = str2;
                        clsArr[i4] = String.class;
                    } else {
                        throw new InternalError("No such param: " + this.f10048g[i4]);
                    }
                    i4++;
                }
            } else {
                return (com.coremedia.iso.boxes.d) cls.newInstance();
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public void c(String str, byte[] bArr, String str2) {
        String property;
        if (bArr != null) {
            if (k1.f9761p.equals(str)) {
                Properties properties = this.f10044c;
                property = properties.getProperty("uuid[" + e.b(bArr).toUpperCase() + "]");
                if (property == null) {
                    Properties properties2 = this.f10044c;
                    property = properties2.getProperty(String.valueOf(str2) + "-uuid[" + e.b(bArr).toUpperCase() + "]");
                }
                if (property == null) {
                    property = this.f10044c.getProperty(k1.f9761p);
                }
            } else {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
        } else {
            property = this.f10044c.getProperty(str);
            if (property == null) {
                StringBuilder sb = this.f10046e;
                sb.append(str2);
                sb.append('-');
                sb.append(str);
                String sb2 = sb.toString();
                this.f10046e.setLength(0);
                property = this.f10044c.getProperty(sb2);
            }
        }
        if (property == null) {
            property = this.f10044c.getProperty("default");
        }
        if (property != null) {
            if (!property.endsWith(")")) {
                this.f10048g = f10043h;
                this.f10047f = property;
                return;
            }
            Matcher matcher = this.f10045d.matcher(property);
            if (matcher.matches()) {
                this.f10047f = matcher.group(1);
                if (matcher.group(2).length() == 0) {
                    this.f10048g = f10043h;
                    return;
                } else {
                    this.f10048g = matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0];
                    return;
                }
            }
            throw new RuntimeException("Cannot work with that constructor: " + property);
        }
        throw new RuntimeException("No box object found for " + str);
    }

    public k(Properties properties) {
        this.f10044c = properties;
    }
}
