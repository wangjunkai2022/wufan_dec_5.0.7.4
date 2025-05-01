.class public Lcom/beizi/ad/internal/nativead/b;
.super Lcom/beizi/ad/internal/network/a;
.source "NativeAdRequestImpl.java"

# interfaces
.implements Lcom/beizi/ad/internal/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/nativead/b$a;
    }
.end annotation


# instance fields
.field public a:Lcom/beizi/ad/internal/c;

.field private c:Lcom/beizi/ad/NativeAdListener;

.field private d:Lcom/beizi/ad/internal/nativead/b$a;

.field private e:Z

.field private f:Z

.field private g:Lcom/beizi/ad/internal/d;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/network/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/beizi/ad/internal/nativead/b;->k:Z

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/DeviceInfoUtil;->retrieveDeviceInfo(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->retrieveUserEnvInfo(Landroid/content/Context;)V

    .line 6
    new-instance v1, Lcom/beizi/ad/internal/d;

    invoke-static {}, Lcom/beizi/ad/internal/utilities/StringUtil;->createRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/beizi/ad/internal/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    .line 7
    invoke-virtual {v1, p2}, Lcom/beizi/ad/internal/d;->a(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1, p3}, Lcom/beizi/ad/internal/d;->a(I)V

    .line 9
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    sget-object p2, Lcom/beizi/ad/internal/j;->e:Lcom/beizi/ad/internal/j;

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/d;->a(Lcom/beizi/ad/internal/j;)V

    .line 10
    new-instance p1, Lcom/beizi/ad/internal/c;

    invoke-direct {p1, p0}, Lcom/beizi/ad/internal/c;-><init>(Lcom/beizi/ad/internal/a;)V

    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->a:Lcom/beizi/ad/internal/c;

    const/4 p2, -0x1

    .line 11
    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/c;->a(I)V

    .line 12
    new-instance p1, Lcom/beizi/ad/internal/nativead/b$a;

    invoke-direct {p1, p0, v0}, Lcom/beizi/ad/internal/nativead/b$a;-><init>(Lcom/beizi/ad/internal/nativead/b;Lcom/beizi/ad/internal/nativead/b$1;)V

    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->d:Lcom/beizi/ad/internal/nativead/b$a;

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/nativead/b;->c:Lcom/beizi/ad/NativeAdListener;

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/nativead/b;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/b;->k:Z

    return p1
.end method

.method static synthetic b(Lcom/beizi/ad/internal/nativead/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/nativead/b;->e:Z

    return p0
.end method

.method static synthetic c(Lcom/beizi/ad/internal/nativead/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/nativead/b;->f:Z

    return p0
.end method


# virtual methods
.method public a(Lcom/beizi/ad/NativeAdListener;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->c:Lcom/beizi/ad/NativeAdListener;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 9
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_placement_id:I

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 7
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_opens_native_browser:I

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->b(Z)V

    return-void
.end method

.method public a()Z
    .locals 3

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_opens_native_browser:I

    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    .line 4
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->h()Z

    move-result v2

    .line 5
    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->h()Z

    move-result v0

    return v0
.end method

.method public a(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 2

    .line 12
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->c:Lcom/beizi/ad/NativeAdListener;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 13
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    const-string v1, "No mNativeAdListener installed for this request, won\'t load a new ad"

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 14
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/ad/internal/nativead/b;->k:Z

    if-eqz p1, :cond_1

    .line 15
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    const-string v1, "Still loading last nativead ad , won\'t load a new ad"

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/d;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 17
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->a:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->a()V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->a:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->c()V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->a:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->b()V

    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/b;->k:Z

    return p1

    :cond_2
    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->h:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->c(Z)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->l()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_placement_id:I

    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    .line 3
    invoke-virtual {v2}, Lcom/beizi/ad/internal/d;->c()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->i:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/b;->e:Z

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b;->j:Ljava/lang/String;

    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/b;->f:Z

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/beizi/ad/NativeAdListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->c:Lcom/beizi/ad/NativeAdListener;

    return-object v0
.end method

.method g()Lcom/beizi/ad/internal/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    return-object v0
.end method

.method public getMediaType()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->i()Lcom/beizi/ad/internal/j;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/beizi/ad/internal/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->d:Lcom/beizi/ad/internal/nativead/b$a;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public isReadyToStart()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->c:Lcom/beizi/ad/NativeAdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b;->g:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/d;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
