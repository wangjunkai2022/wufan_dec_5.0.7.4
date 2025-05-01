.class Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;
.super Ljava/lang/Object;
.source "ComplaintDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$300(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->access$000(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Ljava/lang/String;)V

    return-void
.end method
