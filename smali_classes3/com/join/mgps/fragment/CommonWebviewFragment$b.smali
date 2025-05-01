.class Lcom/join/mgps/fragment/CommonWebviewFragment$b;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment;->U0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$b;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$b;->b:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->m0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
