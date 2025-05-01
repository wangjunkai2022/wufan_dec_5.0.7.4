.class Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$b;
.super Ljava/lang/Object;
.source "PaPaStandAloneOverSeaFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$b;->b:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->e:Lcom/join/mgps/customview/InterceptEventViewPager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/InterceptEventViewPager;->setCurrentItem(I)V

    return-void
.end method
