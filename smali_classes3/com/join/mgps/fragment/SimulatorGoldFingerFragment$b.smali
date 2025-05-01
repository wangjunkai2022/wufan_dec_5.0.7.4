.class Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "SimulatorGoldFingerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Ljava/lang/String;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;->a:Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;

    .line 2
    iget-object p1, p1, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->e:Ljava/util/ArrayList;

    const v0, 0x7f0c040e

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f091526

    .line 1
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;->a(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V

    return-void
.end method
