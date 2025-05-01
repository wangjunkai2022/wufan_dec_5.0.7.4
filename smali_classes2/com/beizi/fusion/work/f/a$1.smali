.class Lcom/beizi/fusion/work/f/a$1;
.super Ljava/lang/Object;
.source "BaseNativeUnifiedWorker.java"

# interfaces
.implements Lcom/beizi/fusion/NativeUnifiedAdResponse;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/a;->aV()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/f/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActionText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aO()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aJ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getECPM()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aK()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImgList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aM()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMaterialType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aN()I

    move-result v0

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aI()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVideoView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aR()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getViewContainer()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aQ()Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public isVideo()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->aP()Z

    move-result v0

    return v0
.end method

.method public registerViewForInteraction(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a$1;->a:Lcom/beizi/fusion/work/f/a;

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/work/f/a;->a(Ljava/util/List;)V

    return-void
.end method
