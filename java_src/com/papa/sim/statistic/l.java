package com.papa.sim.statistic;

import android.content.Context;
/* compiled from: PlainHttpClient.java */
/* loaded from: classes5.dex */
public class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlainHttpClient.java */
    /* loaded from: classes5.dex */
    public class a implements com.papa.sim.statistic.http.a<GameWorldResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JoyStickConfig f58842b;

        a(Context context, JoyStickConfig joyStickConfig) {
            this.f58841a = context;
            this.f58842b = joyStickConfig;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            com.papa.sim.statistic.db.b o4 = com.papa.sim.statistic.db.b.o(this.f58841a);
            com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
            try {
                dVar.t(Event.joyStickConfigPost.name());
                dVar.o(this.f58842b.getId());
                dVar.l(JsonMapper.e().toJson(this.f58842b));
                dVar.s(this.f58842b.getUpdate_time() + "");
                com.papa.sim.statistic.db.b.o(this.f58841a).r(dVar);
            } catch (Exception unused) {
                exc.printStackTrace();
                Event event = Event.setpapaerror;
                if (o4.i(event, this.f58842b.getId() + "")) {
                    return;
                }
                o m4 = o.m(this.f58841a);
                String b5 = dVar.b();
                m4.J(event, b5, this.f58842b.getId() + "");
            }
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(GameWorldResponse gameWorldResponse) {
            if (gameWorldResponse.getError() != 0) {
                com.papa.sim.statistic.db.b o4 = com.papa.sim.statistic.db.b.o(this.f58841a);
                com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
                try {
                    dVar.o(this.f58842b.getId());
                    dVar.t(Event.joyStickConfigPost.name());
                    dVar.l(JsonMapper.e().toJson(this.f58842b));
                    dVar.s(this.f58842b.getUpdate_time() + "");
                    com.papa.sim.statistic.db.b.o(this.f58841a).r(dVar);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    Event event = Event.setpapaerror;
                    if (o4.i(event, this.f58842b.getId() + "")) {
                        return;
                    }
                    o m4 = o.m(this.f58841a);
                    String b5 = dVar.b();
                    m4.J(event, b5, this.f58842b.getId() + "");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlainHttpClient.java */
    /* loaded from: classes5.dex */
    public class b implements com.papa.sim.statistic.http.a<GameWorldResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JoyStickConfig f58844b;

        b(Context context, JoyStickConfig joyStickConfig) {
            this.f58843a = context;
            this.f58844b = joyStickConfig;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            com.papa.sim.statistic.db.b o4 = com.papa.sim.statistic.db.b.o(this.f58843a);
            com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
            try {
                dVar.o(this.f58844b.getId());
                dVar.t(Event.joyStickInfoPost.name());
                dVar.l(JsonMapper.e().toJson(this.f58844b));
                dVar.s(this.f58844b.getUpdate_time() + "");
                com.papa.sim.statistic.db.b.o(this.f58843a).r(dVar);
            } catch (Exception e5) {
                e5.printStackTrace();
                Event event = Event.setpapaerror;
                if (o4.i(event, this.f58844b.getId() + "")) {
                    return;
                }
                o m4 = o.m(this.f58843a);
                String b5 = dVar.b();
                m4.J(event, b5, this.f58844b.getId() + "");
            }
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(GameWorldResponse gameWorldResponse) {
            if (gameWorldResponse.getError() != 0) {
                com.papa.sim.statistic.db.b o4 = com.papa.sim.statistic.db.b.o(this.f58843a);
                com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
                try {
                    dVar.o(this.f58844b.getId());
                    dVar.t(Event.joyStickInfoPost.name());
                    dVar.l(JsonMapper.e().toJson(this.f58844b));
                    dVar.s(this.f58844b.getUpdate_time() + "");
                    com.papa.sim.statistic.db.b.o(this.f58843a).r(dVar);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    Event event = Event.setpapaerror;
                    if (o4.i(event, this.f58844b.getId() + "")) {
                        return;
                    }
                    o m4 = o.m(this.f58843a);
                    String b5 = dVar.b();
                    m4.J(event, b5, this.f58844b.getId() + "");
                }
            }
        }
    }

    public static void a(Context context, JoyStickConfig joyStickConfig) {
        com.papa.sim.statistic.http.c.c().i(context, joyStickConfig, new a(context, joyStickConfig));
    }

    public static void b(Context context, JoyStickConfig joyStickConfig) {
        com.papa.sim.statistic.http.c.c().j(context, joyStickConfig, new b(context, joyStickConfig));
    }
}
