.class Lcom/join/mgps/customview/CustomLoadingView$a;
.super Landroid/os/Handler;
.source "CustomLoadingView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/CustomLoadingView;->m(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/CustomLoadingView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/CustomLoadingView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->LOADING:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {p1}, Lcom/join/mgps/customview/CustomLoadingView;->a(Lcom/join/mgps/customview/CustomLoadingView;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->LOADING_FAILED:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {p1}, Lcom/join/mgps/customview/CustomLoadingView;->b(Lcom/join/mgps/customview/CustomLoadingView;)V

    goto :goto_0

    .line 6
    :cond_1
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->LOADING_SUCCESS:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/join/mgps/customview/CustomLoadingView;->c(Lcom/join/mgps/customview/CustomLoadingView;Z)V

    goto :goto_0

    .line 8
    :cond_2
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->SET_FAILED_IMG_VISIBILITY:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 9
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView;->d(Lcom/join/mgps/customview/CustomLoadingView;I)V

    goto :goto_0

    .line 11
    :cond_3
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->SET_RELOADING_VISIBILITY:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 12
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 13
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView;->e(Lcom/join/mgps/customview/CustomLoadingView;I)V

    goto :goto_0

    .line 14
    :cond_4
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->SET_FAILED_IMG_RES:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 15
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView;->f(Lcom/join/mgps/customview/CustomLoadingView;I)V

    goto :goto_0

    .line 16
    :cond_5
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->SET_FAILED_RELOADING_RES:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 17
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView;->g(Lcom/join/mgps/customview/CustomLoadingView;I)V

    goto :goto_0

    .line 18
    :cond_6
    sget-object v1, Lcom/join/mgps/customview/CustomLoadingView$HandleId;->SET_FAILED_MSG:Lcom/join/mgps/customview/CustomLoadingView$HandleId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 19
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 20
    iget-object v0, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/CustomLoadingView;->h(Lcom/join/mgps/customview/CustomLoadingView;Ljava/lang/String;)V

    .line 21
    :cond_7
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$a;->a:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->invalidate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method
