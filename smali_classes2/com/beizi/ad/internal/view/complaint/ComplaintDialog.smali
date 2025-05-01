.class public Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;
.super Landroid/app/Dialog;
.source "ComplaintDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;,
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;,
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;,
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;,
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;
    }
.end annotation


# static fields
.field private static myAdapter:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;


# instance fields
.field private VIEW_TYPE_1:I

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->list:Ljava/util/List;

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->VIEW_TYPE_1:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p2, 0x0

    .line 5
    iput-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->list:Ljava/util/List;

    const/4 p2, 0x1

    .line 6
    iput p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->VIEW_TYPE_1:I

    .line 7
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->getDislikeBeanList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->list:Ljava/util/List;

    .line 8
    new-instance v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    invoke-direct {v0, p0, p1, p2}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;Landroid/content/Context;Ljava/util/List;)V

    sput-object v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->myAdapter:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->list:Ljava/util/List;

    const/4 p1, 0x1

    .line 11
    iput p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->VIEW_TYPE_1:I

    return-void
.end method

.method static synthetic access$100()Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->myAdapter:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    return-object v0
.end method

.method static synthetic access$900(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->VIEW_TYPE_1:I

    return p0
.end method

.method private getDislikeBeanList()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "\u5783\u573e\u5e7f\u544a"

    const-string v2, "\u611f\u89c9\u6709\u88ab\u5192\u72af\u6216\u88ab\u6b67\u89c6"

    const-string v3, "\u5e7f\u544a\u6d89\u53ca\u6b3a\u8bc8\u9020\u5047"

    const-string v4, "\u5e7f\u544a\u6d89\u53ca\u8272\u60c5\u66b4\u529b"

    const-string v5, "\u5e7f\u544a\u6d89\u53ca\u8fdd\u7981\u5546\u54c1/\u670d\u52a1"

    const-string v6, "\u5bf9\u5e7f\u544a\u5185\u5bb9\u4e0d\u611f\u5174\u8da3"

    .line 2
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x6

    if-ge v2, v3, :cond_0

    .line 3
    aget-object v3, v1, v2

    .line 4
    new-instance v4, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;

    invoke-direct {v4, p0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;)V

    .line 5
    invoke-virtual {v4, v3}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;->setDislikeReason(Ljava/lang/String;)V

    .line 6
    iget v3, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->VIEW_TYPE_1:I

    invoke-virtual {v4, v3}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;->setType(I)V

    .line 7
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
