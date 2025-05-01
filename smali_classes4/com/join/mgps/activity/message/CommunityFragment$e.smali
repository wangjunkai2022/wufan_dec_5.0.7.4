.class Lcom/join/mgps/activity/message/CommunityFragment$e;
.super Ljava/lang/Object;
.source "CommunityFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/CommunityFragment;->i0(IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/message/CommunityFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/CommunityFragment;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->d:Lcom/join/mgps/activity/message/CommunityFragment;

    iput p2, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->b:I

    iput p3, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->d:Lcom/join/mgps/activity/message/CommunityFragment;

    iget-object p1, p1, Lcom/join/mgps/activity/message/CommunityFragment;->v:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->d:Lcom/join/mgps/activity/message/CommunityFragment;

    iget-object v0, p1, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->b:I

    iget v2, p0, Lcom/join/mgps/activity/message/CommunityFragment$e;->c:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/join/mgps/activity/message/CommunityFragment;->e0(Ljava/lang/String;II)V

    return-void
.end method
