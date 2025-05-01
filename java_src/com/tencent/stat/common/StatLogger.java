package com.tencent.stat.common;
/* loaded from: classes6.dex */
public final class StatLogger {

    /* renamed from: a  reason: collision with root package name */
    private String f62928a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f62929b;

    /* renamed from: c  reason: collision with root package name */
    private int f62930c;

    public StatLogger() {
        this.f62928a = "default";
        this.f62929b = true;
        this.f62930c = 2;
    }

    public StatLogger(String str) {
        this.f62928a = "default";
        this.f62929b = true;
        this.f62930c = 2;
        this.f62928a = str;
    }

    private String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(StatLogger.class.getName())) {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    public void d(Object obj) {
        if (isDebugEnable()) {
            debug(obj);
        }
    }

    public void debug(Object obj) {
        if (this.f62930c <= 3) {
            String a5 = a();
            if (a5 == null) {
                obj.toString();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ");
            sb.append(obj);
        }
    }

    public void e(Exception exc) {
        if (isDebugEnable()) {
            error(exc);
        }
    }

    public void e(Object obj) {
        if (isDebugEnable()) {
            error(obj);
        }
    }

    public void error(Exception exc) {
        if (this.f62930c <= 6) {
            StringBuffer stringBuffer = new StringBuffer();
            String a5 = a();
            StackTraceElement[] stackTrace = exc.getStackTrace();
            stringBuffer.append(a5 != null ? a5 + " - " + exc + "\r\n" : exc + "\r\n");
            if (stackTrace == null || stackTrace.length <= 0) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null) {
                    stringBuffer.append("[ " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + " ]\r\n");
                }
            }
        }
    }

    public void error(Object obj) {
        if (this.f62930c <= 6) {
            String a5 = a();
            if (a5 == null) {
                obj.toString();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ");
            sb.append(obj);
        }
    }

    public int getLogLevel() {
        return this.f62930c;
    }

    public void i(Object obj) {
        if (isDebugEnable()) {
            info(obj);
        }
    }

    public void info(Object obj) {
        if (this.f62930c <= 4) {
            String a5 = a();
            if (a5 == null) {
                obj.toString();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ");
            sb.append(obj);
        }
    }

    public boolean isDebugEnable() {
        return this.f62929b;
    }

    public void setDebugEnable(boolean z4) {
        this.f62929b = z4;
    }

    public void setLogLevel(int i4) {
        this.f62930c = i4;
    }

    public void setTag(String str) {
        this.f62928a = str;
    }

    public void v(Object obj) {
        if (isDebugEnable()) {
            verbose(obj);
        }
    }

    public void verbose(Object obj) {
        if (this.f62930c <= 2) {
            String a5 = a();
            if (a5 == null) {
                obj.toString();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ");
            sb.append(obj);
        }
    }

    public void w(Object obj) {
        if (isDebugEnable()) {
            warn(obj);
        }
    }

    public void warn(Object obj) {
        if (this.f62930c <= 5) {
            String a5 = a();
            if (a5 == null) {
                obj.toString();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ");
            sb.append(obj);
        }
    }
}
