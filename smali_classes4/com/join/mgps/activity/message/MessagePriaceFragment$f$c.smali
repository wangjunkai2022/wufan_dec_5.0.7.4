.class Lcom/join/mgps/activity/message/MessagePriaceFragment$f$c;
.super Ljava/lang/Object;
.source "MessagePriaceFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/MessagePriaceFragment$f;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

.field final synthetic c:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/MessagePriaceFragment$f;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$f$c;->c:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    iput-object p2, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$f$c;->b:Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$f$c;->c:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    iget-object p1, p1, Lcom/join/mgps/activity/message/MessagePriaceFragment$f;->c:Lcom/join/mgps/activity/message/MessagePriaceFragment;

    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment$f$c;->b:Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->k0(Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    return-void
.end method
