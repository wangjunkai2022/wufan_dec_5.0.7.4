.class Lcom/beizi/ad/internal/nativead/b$a;
.super Ljava/lang/Object;
.source "NativeAdRequestImpl.java"

# interfaces
.implements Lcom/beizi/ad/internal/b;
.implements Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/nativead/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Lcom/beizi/ad/internal/utilities/ImageService;

.field b:Lcom/beizi/ad/NativeAdResponse;

.field final synthetic c:Lcom/beizi/ad/internal/nativead/b;


# direct methods
.method private constructor <init>(Lcom/beizi/ad/internal/nativead/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/internal/nativead/b;Lcom/beizi/ad/internal/nativead/b$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/nativead/b$a;-><init>(Lcom/beizi/ad/internal/nativead/b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beizi/ad/NativeAdListener;->onAdFailed(I)V

    .line 24
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;Z)Z

    return-void
.end method

.method public a(J)V
    .locals 0

    return-void
.end method

.method public a(Lcom/beizi/ad/internal/network/b;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lcom/beizi/ad/internal/network/b;->a()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->e:Lcom/beizi/ad/internal/j;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/nativead/b$a;->a(I)V

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-interface {p1}, Lcom/beizi/ad/internal/network/b;->d()Lcom/beizi/ad/NativeAdResponse;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-interface {p1}, Lcom/beizi/ad/internal/network/b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/ad/internal/nativead/b;->b(Ljava/lang/String;)V

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-interface {p1}, Lcom/beizi/ad/internal/network/b;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/beizi/ad/internal/nativead/b;->c(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getLandingPageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/beizi/ad/internal/nativead/b;->d(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->b(Lcom/beizi/ad/internal/nativead/b;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->c(Lcom/beizi/ad/internal/nativead/b;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/beizi/ad/NativeAdListener;->onAdLoaded(Lcom/beizi/ad/NativeAdResponse;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->destroy()V

    .line 11
    :goto_0
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;Z)Z

    return-void

    .line 12
    :cond_3
    new-instance p1, Lcom/beizi/ad/internal/utilities/ImageService;

    invoke-direct {p1}, Lcom/beizi/ad/internal/utilities/ImageService;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    .line 13
    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->b:Lcom/beizi/ad/NativeAdResponse;

    .line 14
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->b(Lcom/beizi/ad/internal/nativead/b;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 15
    new-instance p1, Lcom/beizi/ad/internal/nativead/b$a$1;

    invoke-direct {p1, p0, v0}, Lcom/beizi/ad/internal/nativead/b$a$1;-><init>(Lcom/beizi/ad/internal/nativead/b$a;Lcom/beizi/ad/NativeAdResponse;)V

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/beizi/ad/internal/utilities/ImageService;->registerImageReceiver(Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;Ljava/lang/String;)V

    .line 17
    :cond_4
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/b;->c(Lcom/beizi/ad/internal/nativead/b;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 18
    new-instance p1, Lcom/beizi/ad/internal/nativead/b$a$2;

    invoke-direct {p1, p0, v0}, Lcom/beizi/ad/internal/nativead/b$a$2;-><init>(Lcom/beizi/ad/internal/nativead/b$a;Lcom/beizi/ad/NativeAdResponse;)V

    .line 19
    iget-object v1, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/beizi/ad/internal/utilities/ImageService;->registerImageReceiver(Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;Ljava/lang/String;)V

    .line 20
    :cond_5
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    invoke-virtual {p1, p0}, Lcom/beizi/ad/internal/utilities/ImageService;->registerNotification(Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;)V

    .line 21
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/ImageService;->execute()V

    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public onAllImageDownloadsFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;)Lcom/beizi/ad/NativeAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/ad/internal/nativead/b$a;->b:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0, v1}, Lcom/beizi/ad/NativeAdListener;->onAdLoaded(Lcom/beizi/ad/NativeAdResponse;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->b:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->destroy()V

    :goto_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->a:Lcom/beizi/ad/internal/utilities/ImageService;

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->b:Lcom/beizi/ad/NativeAdResponse;

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a;->c:Lcom/beizi/ad/internal/nativead/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/nativead/b;Z)Z

    return-void
.end method
