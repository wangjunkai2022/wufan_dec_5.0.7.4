.class Lcom/join/mgps/adapter/y4$f;
.super Ljava/lang/Object;
.source "SearchAppAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/y4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field final synthetic c:Lcom/join/mgps/adapter/y4;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/y4;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/y4$f;->c:Lcom/join/mgps/adapter/y4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x7f09145d

    .line 2
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/y4$f;->a:Landroid/widget/TextView;

    const p1, 0x7f091479

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/y4$f;->b:Landroid/widget/TextView;

    return-void
.end method
