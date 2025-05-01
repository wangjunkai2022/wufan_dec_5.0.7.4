.class Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;
.super Ljava/lang/Object;
.source "GmaeFormPostFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GmaeFormPostFragment_;->A1(Landroid/widget/AbsListView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/AbsListView;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->b:Landroid/widget/AbsListView;

    iput p3, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->b:Landroid/widget/AbsListView;

    iget v2, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->Y1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;I)V

    return-void
.end method
