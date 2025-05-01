.class Lcom/join/mgps/adapter/ForumBaseAdapter$l0$a;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$l0;->c(Landroid/widget/ImageView;Lcom/join/mgps/dto/ForumBean$ForumTopicBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ForumBean$ForumTopicBean;

.field final synthetic c:Lcom/join/mgps/adapter/ForumBaseAdapter$l0;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ForumBaseAdapter$l0;Lcom/join/mgps/dto/ForumBean$ForumTopicBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$l0$a;->c:Lcom/join/mgps/adapter/ForumBaseAdapter$l0;

    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$l0$a;->b:Lcom/join/mgps/dto/ForumBean$ForumTopicBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$l0$a;->b:Lcom/join/mgps/dto/ForumBean$ForumTopicBean;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/j0;->D0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumTopicBean;)V

    return-void
.end method
