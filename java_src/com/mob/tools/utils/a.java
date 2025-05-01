package com.mob.tools.utils;

import com.mob.tools.utils.ExecutorDispatcher;
/* loaded from: classes5.dex */
public interface a {
    <T extends ExecutorDispatcher.SafeRunnable> void executeDelayed(T t4, long j4);

    <T extends ExecutorDispatcher.SafeRunnable> void executeDuctile(T t4);

    <T extends ExecutorDispatcher.SafeRunnable> void executeImmediately(T t4);

    <T extends ExecutorDispatcher.SafeRunnable> void executeSerial(T t4);
}
