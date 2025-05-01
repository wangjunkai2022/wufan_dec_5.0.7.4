package com.coremedia.iso;

import com.googlecode.mp4parser.util.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
/* compiled from: BoxReplacer.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f10039a = false;

    public static void a(Map<String, com.coremedia.iso.boxes.d> map, File file) throws IOException {
        f fVar = new f(new com.googlecode.mp4parser.g(new RandomAccessFile(file, "r").getChannel()));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, com.coremedia.iso.boxes.d> entry : map.entrySet()) {
            com.coremedia.iso.boxes.d d5 = m.d(fVar, entry.getKey());
            hashMap.put(m.a(d5), entry.getValue());
            hashMap2.put(m.a(d5), Long.valueOf(d5.j()));
        }
        fVar.close();
        FileChannel channel = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0).getChannel();
        for (String str : hashMap.keySet()) {
            channel.position(((Long) hashMap2.get(str)).longValue());
            ((com.coremedia.iso.boxes.d) hashMap.get(str)).a(channel);
        }
        channel.close();
    }
}
