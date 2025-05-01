.class public final synthetic Lcom/join/mgps/fragment/q0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/FriendFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/FriendFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/q0;->b:Lcom/join/mgps/fragment/FriendFragment;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/q0;->b:Lcom/join/mgps/fragment/FriendFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/FriendFragment;->e0(Lcom/join/mgps/fragment/FriendFragment;)V

    return-void
.end method
