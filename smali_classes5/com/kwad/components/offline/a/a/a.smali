.class public final Lcom/kwad/components/offline/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final adq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final adr:Ljava/lang/String;

.field private static final ads:Ljava/lang/String;

.field private static final adt:Ljava/lang/String;

.field private static final adu:Ljava/lang/String;

.field private static final adv:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/components/offline/a/a/a;->adq:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, "c++_shared"

    aput-object v3, v2, v1

    const-string v3, "lib%s.so"

    .line 2
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/a/a/a;->adr:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kwaiplayer"

    aput-object v4, v2, v1

    .line 3
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/a/a/a;->ads:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kste"

    aput-object v4, v2, v1

    .line 4
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/a/a/a;->adt:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "hodor"

    aput-object v4, v2, v1

    .line 5
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/a/a/a;->adu:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "aegon"

    aput-object v2, v0, v1

    .line 6
    invoke-static {v3, v0}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/components/offline/a/a/a;->adv:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;)V
    .locals 9
    .param p1    # Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/components/offline/a/a/a;->adq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/utils/AbiUtil;->isArm64(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adr:Ljava/lang/String;

    const-string v3, "dcd68cd059cb06a9596ba6839c2e8858"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->ads:Ljava/lang/String;

    const-string v3, "cf71bcc476b2b25e2e62b541275ad78c"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adt:Ljava/lang/String;

    const-string v3, "ebb56fa9c5701350497e281c2446660f"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adu:Ljava/lang/String;

    const-string v3, "a61edf93bc5abc7799c5444ccbaf140b"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adv:Ljava/lang/String;

    const-string v3, "c256c0d7f79ad4d47db61cb8e8ab142a"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/adLive/ks_so-adLiveArm64v8aRelease-3.3.44.2-e8fbb3a5f8-666.apk"

    const-string v3, "adLive-v8a"

    const-string v4, "41a4213dcbf3ed262fc69daf7d4a29e5"

    goto :goto_0

    .line 10
    :cond_1
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adr:Ljava/lang/String;

    const-string v3, "e3fdbf82716c2cb9b666a3880ab94003"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->ads:Ljava/lang/String;

    const-string v3, "2ba24f9d0a6e786af477ed1e2dad148b"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adt:Ljava/lang/String;

    const-string v3, "71a9baa45905a6f0e527e5a2e06e8808"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adu:Ljava/lang/String;

    const-string v3, "d997935a035d00a67dc46e26427b8bf9"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v2, Lcom/kwad/components/offline/a/a/a;->adv:Ljava/lang/String;

    const-string v3, "bdac6eea0d25da98061c21234f3b20c5"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/adLive/ks_so-adLiveArmeabiv7aRelease-3.3.44.2-e8fbb3a5f8-666.apk"

    const-string v3, "adLive-v7a"

    const-string v4, "ceddd5a3aae9148992bee153a29a25fb"

    .line 15
    :goto_0
    new-instance v5, Lcom/kwad/library/solder/lib/c/b;

    invoke-direct {v5}, Lcom/kwad/library/solder/lib/c/b;-><init>()V

    const-string v6, "com.kwad.components.adLive"

    .line 16
    invoke-static {p0, v6}, Lcom/kwad/library/solder/a/a;->j(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/library/b/a;

    move-result-object v6

    .line 17
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "adLiveOfflineCompoPlugin: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "AdLiveSoLoadHelper"

    invoke-static {v8, v7}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    instance-of v7, v6, Lcom/kwad/library/b/a;

    if-eqz v7, :cond_2

    .line 19
    invoke-virtual {v6}, Lcom/kwad/library/b/a;->xy()Lcom/kwad/library/b/a/b;

    move-result-object v6

    iput-object v6, v5, Lcom/kwad/library/solder/lib/c/b;->ale:Ljava/lang/ClassLoader;

    .line 20
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/kwad/sdk/core/network/idc/a;->ee(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v5, Lcom/kwad/library/solder/lib/c/b;->akW:Ljava/lang/String;

    .line 21
    iput-boolean v1, v5, Lcom/kwad/library/solder/lib/c/b;->JE:Z

    .line 22
    iput-object v3, v5, Lcom/kwad/library/solder/lib/c/b;->akV:Ljava/lang/String;

    const-string v2, "3.3.44.3"

    .line 23
    iput-object v2, v5, Lcom/kwad/library/solder/lib/c/b;->version:Ljava/lang/String;

    .line 24
    iput-object v0, v5, Lcom/kwad/library/solder/lib/c/b;->alb:Ljava/util/HashMap;

    .line 25
    iput-object v4, v5, Lcom/kwad/library/solder/lib/c/b;->akY:Ljava/lang/String;

    .line 26
    iput-boolean v1, v5, Lcom/kwad/library/solder/lib/c/b;->akZ:Z

    .line 27
    new-instance v0, Lcom/kwad/components/offline/a/a/a$1;

    invoke-direct {v0, p1}, Lcom/kwad/components/offline/a/a/a$1;-><init>(Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;)V

    invoke-static {p0, v5, v0}, Lcom/kwad/library/solder/a/a;->a(Landroid/content/Context;Lcom/kwad/library/solder/lib/c/b;Lcom/kwad/library/solder/lib/ext/b$c;)V

    return-void
.end method
