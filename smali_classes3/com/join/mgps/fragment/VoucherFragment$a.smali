.class Lcom/join/mgps/fragment/VoucherFragment$a;
.super Ljava/lang/Object;
.source "VoucherFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/VoucherFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/VoucherFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/VoucherFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/VoucherFragment$a;->b:Lcom/join/mgps/fragment/VoucherFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment$a;->b:Lcom/join/mgps/fragment/VoucherFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/VoucherFragment;->g0(Lcom/join/mgps/fragment/VoucherFragment;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment$a;->b:Lcom/join/mgps/fragment/VoucherFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/VoucherFragment;->loadData()V

    return-void
.end method
