.class Lcom/join/mgps/activity/MYAccountDetialActivity$b;
.super Ljava/lang/Object;
.source "MYAccountDetialActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MYAccountDetialActivity;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Lcom/join/mgps/activity/MYAccountDetialActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MYAccountDetialActivity;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->c:Lcom/join/mgps/activity/MYAccountDetialActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->b:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->c:Lcom/join/mgps/activity/MYAccountDetialActivity;

    iget-object v0, p1, Lcom/join/mgps/activity/MYAccountDetialActivity;->s:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0$b;

    iget-object v1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/wufan/user/service/protobuf/n0$b;->c4(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    iput-object v0, p1, Lcom/join/mgps/activity/MYAccountDetialActivity;->s:Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->c:Lcom/join/mgps/activity/MYAccountDetialActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->F0()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->c:Lcom/join/mgps/activity/MYAccountDetialActivity;

    const-string v0, "\u6635\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff01"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->showToast(Ljava/lang/String;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity$b;->c:Lcom/join/mgps/activity/MYAccountDetialActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->g0(Lcom/join/mgps/activity/MYAccountDetialActivity;)Lcom/join/mgps/dialog/r1;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
