.class public Lcom/join/mgps/fragment/MyVoucherGameFragment_$i;
.super Lorg/androidannotations/api/builder/d;
.source "MyVoucherGameFragment_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/MyVoucherGameFragment_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/androidannotations/api/builder/d<",
        "Lcom/join/mgps/fragment/MyVoucherGameFragment_$i;",
        "Lcom/join/mgps/fragment/MyVoucherGameFragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/androidannotations/api/builder/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/join/mgps/fragment/MyVoucherGameFragment;
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/MyVoucherGameFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/MyVoucherGameFragment_;-><init>()V

    .line 2
    iget-object v1, p0, Lorg/androidannotations/api/builder/d;->args:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment_$i;->a()Lcom/join/mgps/fragment/MyVoucherGameFragment;

    move-result-object v0

    return-object v0
.end method
