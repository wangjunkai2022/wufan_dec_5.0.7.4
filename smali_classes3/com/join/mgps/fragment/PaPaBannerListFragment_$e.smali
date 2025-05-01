.class Lcom/join/mgps/fragment/PaPaBannerListFragment_$e;
.super Ljava/lang/Object;
.source "PaPaBannerListFragment_.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/PaPaBannerListFragment_;->onViewChanged(La4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/PaPaBannerListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaBannerListFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment_$e;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment_$e;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment_;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->setNetwork()V

    return-void
.end method
