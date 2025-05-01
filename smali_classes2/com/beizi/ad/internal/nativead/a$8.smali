.class Lcom/beizi/ad/internal/nativead/a$8;
.super Ljava/lang/Object;
.source "BeiZiNativeAdResponse.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/nativead/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/nativead/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->d(Lcom/beizi/ad/internal/nativead/a;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->d(Lcom/beizi/ad/internal/nativead/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "lance"

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setClickListener:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v2, Lcom/beizi/ad/internal/h;

    invoke-direct {v2, v1}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v2, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/a;->e(Lcom/beizi/ad/internal/nativead/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v2}, Lcom/beizi/ad/internal/nativead/a;->f(Lcom/beizi/ad/internal/nativead/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v0}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 9
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->nativeLogTag:Ljava/lang/String;

    const-string v0, "Unable to handle click."

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/a;->j(Lcom/beizi/ad/internal/nativead/a;)Lcom/beizi/ad/internal/nativead/NativeAdEventListener;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 11
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {p1}, Lcom/beizi/ad/internal/nativead/a;->j(Lcom/beizi/ad/internal/nativead/a;)Lcom/beizi/ad/internal/nativead/NativeAdEventListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/nativead/NativeAdEventListener;->onAdWasClicked()V

    .line 12
    :cond_3
    iget-object p1, p0, Lcom/beizi/ad/internal/nativead/a$8;->a:Lcom/beizi/ad/internal/nativead/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/nativead/a;->b(Lcom/beizi/ad/internal/nativead/a;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method
