.class Lcom/join/mgps/adapter/o3$e;
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
.field final synthetic b:Lcom/join/mgps/dto/MgpapaMainItemBean;

.field final synthetic c:Lcom/join/mgps/adapter/o3;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/MgpapaMainItemBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o3$e;->c:Lcom/join/mgps/adapter/o3;

    iput-object p2, p0, Lcom/join/mgps/adapter/o3$e;->b:Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/o3$e;->c:Lcom/join/mgps/adapter/o3;

    iget-object v0, p0, Lcom/join/mgps/adapter/o3$e;->b:Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/adapter/o3;->p(Lcom/join/mgps/adapter/o3;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/o3$e;->c:Lcom/join/mgps/adapter/o3;

    invoke-static {p1}, Lcom/join/mgps/adapter/o3;->o(Lcom/join/mgps/adapter/o3;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/MGInformationActivity_;->v0(Landroid/content/Context;)Lcom/join/mgps/activity/MGInformationActivity_$l;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
