.class Lcom/beizi/fusion/work/splash/f$2;
.super Ljava/lang/Object;
.source "GdtSplashWorker.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/f;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/f;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/f$2;->a:Lcom/beizi/fusion/work/splash/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;)I
    .locals 0

    .line 1
    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getLevel()I

    move-result p2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getLevel()I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    check-cast p2, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/splash/f$2;->a(Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;)I

    move-result p1

    return p1
.end method
