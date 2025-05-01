.class Lcom/join/mgps/adapter/m0$a;
.super Ljava/lang/Object;
.source "GamdetialInformationStrategyAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/m0;->g(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;I[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:[Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/adapter/m0;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/m0;I[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/m0$a;->d:Lcom/join/mgps/adapter/m0;

    iput p2, p0, Lcom/join/mgps/adapter/m0$a;->b:I

    iput-object p3, p0, Lcom/join/mgps/adapter/m0$a;->c:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v0, p0, Lcom/join/mgps/adapter/m0$a;->b:I

    iget-object v1, p0, Lcom/join/mgps/adapter/m0$a;->c:[Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/j0;->G0(Landroid/content/Context;I[Ljava/lang/String;)V

    return-void
.end method
