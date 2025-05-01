.class public Lcom/join/mgps/adapter/ChoiceAdapter$OrderTopVH;
.super Lcom/join/mgps/adapter/ChoiceAdapter$VH;
.source "ChoiceAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ChoiceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OrderTopVH"
.end annotation


# instance fields
.field public b:Landroid/view/View;

.field final synthetic c:Lcom/join/mgps/adapter/ChoiceAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/ChoiceAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$OrderTopVH;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ChoiceAdapter$VH;-><init>(Lcom/join/mgps/adapter/ChoiceAdapter;Landroid/view/View;)V

    const p1, 0x7f090e4f

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$OrderTopVH;->b:Landroid/view/View;

    return-void
.end method
