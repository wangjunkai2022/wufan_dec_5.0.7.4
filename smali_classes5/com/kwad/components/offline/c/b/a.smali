.class public final Lcom/kwad/components/offline/c/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final adq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final adr:Ljava/lang/String;

.field private static final ael:Ljava/lang/String;

.field private static final aem:Ljava/lang/String;

.field private static final aen:Ljava/lang/String;

.field private static final aeo:Ljava/lang/String;

.field private static final aep:Ljava/lang/String;

.field private static final aeq:Ljava/lang/String;

.field private static aer:J

.field private static aes:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/components/offline/c/b/a;->adq:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, "tk_runtime_v0_0_161"

    aput-object v3, v2, v1

    const-string v3, "lib%s.so"

    .line 2
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->ael:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "tk_runtime_lite_v0_0_161"

    aput-object v4, v2, v1

    .line 3
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->aem:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kwai-v8"

    aput-object v4, v2, v1

    .line 4
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->aen:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kwai-v8-lite"

    aput-object v4, v2, v1

    .line 5
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->aeo:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kwad-fb"

    aput-object v4, v2, v1

    .line 6
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->aep:Ljava/lang/String;

    new-array v2, v0, [Ljava/lang/Object;

    const-string v4, "kwad-yoga"

    aput-object v4, v2, v1

    .line 7
    invoke-static {v3, v2}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kwad/components/offline/c/b/a;->aeq:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "c++_shared"

    aput-object v2, v0, v1

    .line 8
    invoke-static {v3, v0}, Lcom/kwad/sdk/utils/aa;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/components/offline/c/b/a;->adr:Ljava/lang/String;

    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/kwad/components/offline/c/b/a;->aes:Ljava/lang/Boolean;

    return-void
.end method

.method static synthetic M(J)J
    .locals 0

    .line 1
    sput-wide p0, Lcom/kwad/components/offline/c/b/a;->aer:J

    return-wide p0
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;)V
    .locals 8
    .param p1    # Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/components/offline/c/b/a;->adq:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    invoke-static {}, Lcom/kwad/components/offline/c/b/a;->useTkLite()Z

    move-result v2

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/utils/AbiUtil;->isArm64(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cr()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    const-string v3, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v8_lite_3358"

    goto :goto_0

    :cond_2
    const-string v3, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v8_3358"

    :goto_0
    if-eqz v2, :cond_3

    const-string v4, "sotk-v8a-lite"

    goto :goto_1

    :cond_3
    const-string v4, "sotk-v8a"

    :goto_1
    if-eqz v2, :cond_4

    const-string v5, "0e2d6748c990aa021d01521b6926a5d1"

    goto :goto_2

    :cond_4
    const-string v5, "581986671ff8549adfa5bcc94410a6d5"

    :goto_2
    if-eqz v2, :cond_5

    .line 8
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aem:Ljava/lang/String;

    const-string v7, "0666493e16b18f08ec178a949c41ce30"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aeo:Ljava/lang/String;

    const-string v7, "77545ba1892c1a1d4a039db37b3249eb"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 10
    :cond_5
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->ael:Ljava/lang/String;

    const-string v7, "a72b02a82df72cd82a3acace986099ad"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aen:Ljava/lang/String;

    const-string v7, "7316cd8d074b04e6cb21486288d314ce"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :goto_3
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aep:Ljava/lang/String;

    const-string v7, "31f065607e6da6b741330d1df0b35460"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aeq:Ljava/lang/String;

    const-string v7, "76308532f64b68fd5a930c42cceec22b"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->adr:Ljava/lang/String;

    const-string v7, "2e989e1c8d777ce169376feb637530e9"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    .line 15
    :cond_6
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cq()Ljava/lang/String;

    move-result-object v3

    .line 16
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v2, :cond_8

    const-string v3, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v7_lite_3358"

    goto :goto_4

    :cond_8
    const-string v3, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v7_3358"

    :goto_4
    if-eqz v2, :cond_9

    const-string v4, "sotk-v7a-lite"

    goto :goto_5

    :cond_9
    const-string v4, "sotk-v7a"

    :goto_5
    if-eqz v2, :cond_a

    const-string v5, "e9821df3990aca6fc2cd6b5b71c5a1df"

    goto :goto_6

    :cond_a
    const-string v5, "16335fa1eb7d19586a6be6aa74778b5b"

    :goto_6
    if-eqz v2, :cond_b

    .line 17
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aem:Ljava/lang/String;

    const-string v7, "cb8a97957aa4cb944a27f4353be3384c"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aeo:Ljava/lang/String;

    const-string v7, "2dbd72527a0739740746adaae48ed2e0"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 19
    :cond_b
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->ael:Ljava/lang/String;

    const-string v7, "75ae8eff358638dcddad68117cbbc494"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aen:Ljava/lang/String;

    const-string v7, "519ba633e88efafb8fbd536d800da734"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :goto_7
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aep:Ljava/lang/String;

    const-string v7, "eff11bebb8a3c872fa30b0484b460d12"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->aeq:Ljava/lang/String;

    const-string v7, "2c6f402c6a565d2e6912b0013fa59380"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v6, Lcom/kwad/components/offline/c/b/a;->adr:Ljava/lang/String;

    const-string v7, "2ce4deb75b884953f20ab2e6e149be98"

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :goto_8
    new-instance v6, Lcom/kwad/library/solder/lib/c/b;

    invoke-direct {v6}, Lcom/kwad/library/solder/lib/c/b;-><init>()V

    .line 25
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object v7

    invoke-virtual {v7, v3}, Lcom/kwad/sdk/core/network/idc/a;->ee(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 26
    iput-object v3, v6, Lcom/kwad/library/solder/lib/c/b;->akW:Ljava/lang/String;

    .line 27
    iput-boolean v1, v6, Lcom/kwad/library/solder/lib/c/b;->JE:Z

    .line 28
    iput-object v4, v6, Lcom/kwad/library/solder/lib/c/b;->akV:Ljava/lang/String;

    if-eqz v2, :cond_c

    const-string v1, "3.3.60-lite"

    goto :goto_9

    :cond_c
    const-string v1, "3.3.60"

    .line 29
    :goto_9
    iput-object v1, v6, Lcom/kwad/library/solder/lib/c/b;->version:Ljava/lang/String;

    const/4 v1, 0x0

    .line 30
    iput-boolean v1, v6, Lcom/kwad/library/solder/lib/c/b;->akZ:Z

    .line 31
    iput-object v5, v6, Lcom/kwad/library/solder/lib/c/b;->akY:Ljava/lang/String;

    .line 32
    iput-object v0, v6, Lcom/kwad/library/solder/lib/c/b;->alb:Ljava/util/HashMap;

    const-string v0, "com.kwad.components.tachikoma"

    .line 33
    invoke-static {p0, v0}, Lcom/kwad/library/solder/a/a;->j(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/library/b/a;

    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tkOfflineCompoPlugin: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TkSoLoadHelper"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    instance-of v1, v0, Lcom/kwad/library/b/a;

    if-eqz v1, :cond_d

    .line 36
    invoke-virtual {v0}, Lcom/kwad/library/b/a;->xy()Lcom/kwad/library/b/a/b;

    move-result-object v0

    iput-object v0, v6, Lcom/kwad/library/solder/lib/c/b;->ale:Ljava/lang/ClassLoader;

    .line 37
    :cond_d
    new-instance v0, Lcom/kwad/components/offline/c/b/a$1;

    invoke-direct {v0, p1}, Lcom/kwad/components/offline/c/b/a$1;-><init>(Lcom/kwad/components/offline/api/core/soloader/SoLoadListener;)V

    invoke-static {p0, v6, v0}, Lcom/kwad/library/solder/a/a;->a(Landroid/content/Context;Lcom/kwad/library/solder/lib/c/b;Lcom/kwad/library/solder/lib/ext/b$c;)V

    return-void
.end method

.method static synthetic up()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/kwad/components/offline/c/b/a;->aer:J

    return-wide v0
.end method

.method public static useTkLite()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/offline/c/b/a;->aes:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/kwad/sdk/core/config/c;->ase:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/kwad/components/offline/c/b/a;->aes:Ljava/lang/Boolean;

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/components/offline/c/b/a;->aes:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
