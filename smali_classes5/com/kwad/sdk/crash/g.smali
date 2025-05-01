.class public final Lcom/kwad/sdk/crash/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/crash/g$a;
    }
.end annotation


# static fields
.field private static final aHc:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/crash/g;->aHc:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/kwad/library/solder/lib/c/b;Lcom/kwad/sdk/crash/g$a;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/crash/g$a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    new-instance v0, Lcom/kwad/sdk/crash/g$1;

    invoke-direct {v0, p2}, Lcom/kwad/sdk/crash/g$1;-><init>(Lcom/kwad/sdk/crash/g$a;)V

    invoke-static {p0, p1, v0}, Lcom/kwad/library/solder/a/a;->a(Landroid/content/Context;Lcom/kwad/library/solder/lib/c/b;Lcom/kwad/library/solder/lib/ext/b$c;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/crash/c;Lcom/kwad/sdk/crash/g$a;)V
    .locals 7
    .param p0    # Lcom/kwad/sdk/crash/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/g;->aHc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/kwad/sdk/crash/g$a;->HY()V

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/crash/c;->sdkVersion:Ljava/lang/String;

    iget-object v2, p0, Lcom/kwad/sdk/crash/c;->aGF:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sdkVersion:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/crash/c;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "*supportAppVersion:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/kwad/sdk/crash/c;->aGF:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ExceptionSoLoadHelper"

    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-interface {p1}, Lcom/kwad/sdk/crash/g$a;->HZ()V

    return-void

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/kwad/sdk/crash/c;->context:Landroid/content/Context;

    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/utils/AbiUtil;->isArm64(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/crash/c;->aGI:Ljava/lang/String;

    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/so/exception/202305301754/ks_so-exceptionArm64v8aRelease-3.3.47-e8fbb3a5f8-666.apk"

    .line 11
    :cond_2
    iget-object v3, p0, Lcom/kwad/sdk/crash/c;->aGK:Ljava/lang/String;

    const-string v4, "exception-v8a"

    goto :goto_0

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/kwad/sdk/crash/c;->aGJ:Ljava/lang/String;

    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v0, "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/so/exception/202305301754/ks_so-exceptionArmeabiv7aRelease-3.3.47-e8fbb3a5f8-666.apk"

    .line 14
    :cond_4
    iget-object v3, p0, Lcom/kwad/sdk/crash/c;->aGL:Ljava/lang/String;

    const-string v4, "exception-v7a"

    .line 15
    :goto_0
    new-instance v5, Lcom/kwad/library/solder/lib/c/b;

    invoke-direct {v5}, Lcom/kwad/library/solder/lib/c/b;-><init>()V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/kwad/sdk/core/network/idc/a;->ee(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/kwad/library/solder/lib/c/b;->akW:Ljava/lang/String;

    .line 17
    iput-boolean v2, v5, Lcom/kwad/library/solder/lib/c/b;->JE:Z

    .line 18
    iput-object v4, v5, Lcom/kwad/library/solder/lib/c/b;->akV:Ljava/lang/String;

    .line 19
    iget-object p0, p0, Lcom/kwad/sdk/crash/c;->aGE:Ljava/lang/String;

    iput-object p0, v5, Lcom/kwad/library/solder/lib/c/b;->version:Ljava/lang/String;

    .line 20
    iput-object v3, v5, Lcom/kwad/library/solder/lib/c/b;->akY:Ljava/lang/String;

    const/4 p0, 0x0

    .line 21
    iput-boolean p0, v5, Lcom/kwad/library/solder/lib/c/b;->akZ:Z

    .line 22
    invoke-static {v1, v5, p1}, Lcom/kwad/sdk/crash/g;->a(Landroid/content/Context;Lcom/kwad/library/solder/lib/c/b;Lcom/kwad/sdk/crash/g$a;)V

    return-void
.end method
