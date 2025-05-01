.class Lcn/sharesdk/framework/d$1;
.super Ljava/lang/Object;
.source "InnerPlatformActionListener.java"

# interfaces
.implements Lcn/sharesdk/framework/PlatformActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic b:I

.field final synthetic c:Ljava/util/HashMap;

.field final synthetic d:Lcn/sharesdk/framework/d;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;ILjava/util/HashMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    iput-object p2, p0, Lcn/sharesdk/framework/d$1;->a:Lcn/sharesdk/framework/PlatformActionListener;

    iput p3, p0, Lcn/sharesdk/framework/d$1;->b:I

    iput-object p4, p0, Lcn/sharesdk/framework/d$1;->c:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Lcn/sharesdk/framework/Platform;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    iget-object v0, p0, Lcn/sharesdk/framework/d$1;->a:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-static {p2, v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;

    .line 2
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    iget v0, p0, Lcn/sharesdk/framework/d$1;->b:I

    iget-object v1, p0, Lcn/sharesdk/framework/d$1;->c:Ljava/util/HashMap;

    invoke-interface {p2, p1, v0, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    :cond_0
    return-void
.end method

.method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/Platform;",
            "I",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    iget-object v0, p0, Lcn/sharesdk/framework/d$1;->a:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-static {p2, v0}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;

    .line 2
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    iget v0, p0, Lcn/sharesdk/framework/d$1;->b:I

    iget-object v1, p0, Lcn/sharesdk/framework/d$1;->c:Ljava/util/HashMap;

    invoke-interface {p2, p1, v0, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    .line 4
    :cond_0
    new-instance p2, Lcn/sharesdk/framework/a/b/b;

    invoke-direct {p2}, Lcn/sharesdk/framework/a/b/b;-><init>()V

    .line 5
    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getPlatformId()I

    move-result v0

    iput v0, p2, Lcn/sharesdk/framework/a/b/b;->a:I

    .line 6
    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TencentWeibo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v0

    const-string v1, "name"

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v0

    invoke-virtual {v0}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p2, Lcn/sharesdk/framework/a/b/b;->b:Ljava/lang/String;

    .line 7
    new-instance v0, Lcom/mob/tools/utils/Hashon;

    invoke-direct {v0}, Lcom/mob/tools/utils/Hashon;-><init>()V

    invoke-virtual {v0, p3}, Lcom/mob/tools/utils/Hashon;->fromHashMap(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p2, Lcn/sharesdk/framework/a/b/b;->c:Ljava/lang/String;

    .line 8
    iget-object p3, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p3, p1}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/Platform;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcn/sharesdk/framework/a/b/b;->d:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcn/sharesdk/framework/a/d;->a()Lcn/sharesdk/framework/a/d;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1, p2}, Lcn/sharesdk/framework/a/d;->a(Lcn/sharesdk/framework/a/b/c;)V

    :cond_2
    return-void
.end method

.method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcn/sharesdk/framework/utils/SSDKLog;->b(Ljava/lang/Throwable;)I

    .line 2
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    iget-object p3, p0, Lcn/sharesdk/framework/d$1;->a:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-static {p2, p3}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;Lcn/sharesdk/framework/PlatformActionListener;)Lcn/sharesdk/framework/PlatformActionListener;

    .line 3
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lcn/sharesdk/framework/d$1;->d:Lcn/sharesdk/framework/d;

    invoke-static {p2}, Lcn/sharesdk/framework/d;->a(Lcn/sharesdk/framework/d;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p2

    iget p3, p0, Lcn/sharesdk/framework/d$1;->b:I

    iget-object v0, p0, Lcn/sharesdk/framework/d$1;->c:Ljava/util/HashMap;

    invoke-interface {p2, p1, p3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    :cond_0
    return-void
.end method
