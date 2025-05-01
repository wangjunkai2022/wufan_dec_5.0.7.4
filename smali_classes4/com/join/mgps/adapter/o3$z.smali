.class Lcom/join/mgps/adapter/o3$z;
.super Ljava/lang/Object;
.source "PapaMainAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/o3;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/adapter/o3;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/o3;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o3$z;->c:Lcom/join/mgps/adapter/o3;

    iput p2, p0, Lcom/join/mgps/adapter/o3$z;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/o3$z;->c:Lcom/join/mgps/adapter/o3;

    iget-object p1, p1, Lcom/join/mgps/adapter/o3;->l:Lcom/join/android/app/component/video/c;

    iget v0, p0, Lcom/join/mgps/adapter/o3$z;->b:I

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/video/c;->F(I)V

    return-void
.end method
