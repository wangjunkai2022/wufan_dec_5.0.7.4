.class Lcom/join/mgps/adapter/SimpleCarouselAdapter$a;
.super Ljava/lang/Object;
.source "SimpleCarouselAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/SimpleCarouselAdapter;->c(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/adapter/SimpleCarouselAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/SimpleCarouselAdapter;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimpleCarouselAdapter$a;->c:Lcom/join/mgps/adapter/SimpleCarouselAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/SimpleCarouselAdapter$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/SimpleCarouselAdapter$a;->c:Lcom/join/mgps/adapter/SimpleCarouselAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/SimpleCarouselAdapter;->d(Lcom/join/mgps/adapter/SimpleCarouselAdapter;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/adapter/SimpleCarouselAdapter$a;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/BannerBean;

    invoke-static {p1, v0}, Lcom/join/mgps/adapter/SimpleCarouselAdapter;->e(Lcom/join/mgps/adapter/SimpleCarouselAdapter;Lcom/join/mgps/dto/BannerBean;)V

    return-void
.end method
