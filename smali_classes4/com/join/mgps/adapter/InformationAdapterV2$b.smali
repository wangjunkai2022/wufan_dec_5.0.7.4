.class Lcom/join/mgps/adapter/InformationAdapterV2$b;
.super Ljava/lang/Object;
.source "InformationAdapterV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/InformationAdapterV2;->h(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/InformationCommentBeanV2;

.field final synthetic c:Lcom/join/mgps/adapter/InformationAdapterV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/InformationAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/InformationAdapterV2$b;->c:Lcom/join/mgps/adapter/InformationAdapterV2;

    iput-object p2, p0, Lcom/join/mgps/adapter/InformationAdapterV2$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Landroid/os/Message;

    invoke-direct {p1}, Landroid/os/Message;-><init>()V

    const/4 v0, 0x2

    .line 2
    iput v0, p1, Landroid/os/Message;->what:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/adapter/InformationAdapterV2$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    iput-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/InformationAdapterV2$b;->c:Lcom/join/mgps/adapter/InformationAdapterV2;

    invoke-static {v0}, Lcom/join/mgps/adapter/InformationAdapterV2;->c(Lcom/join/mgps/adapter/InformationAdapterV2;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
