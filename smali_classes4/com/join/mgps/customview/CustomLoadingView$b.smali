.class Lcom/join/mgps/customview/CustomLoadingView$b;
.super Ljava/lang/Object;
.source "CustomLoadingView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/CustomLoadingView;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/CustomLoadingView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/CustomLoadingView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CustomLoadingView$b;->b:Lcom/join/mgps/customview/CustomLoadingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/IntentUtil;->goWirelessSettings(Landroid/content/Context;)V

    return-void
.end method
