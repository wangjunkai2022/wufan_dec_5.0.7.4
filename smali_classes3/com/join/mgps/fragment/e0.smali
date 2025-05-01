.class public final synthetic Lcom/join/mgps/fragment/e0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/FriendCardFragment;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/FriendCardFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/e0;->b:Lcom/join/mgps/fragment/FriendCardFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/e0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/e0;->b:Lcom/join/mgps/fragment/FriendCardFragment;

    iget-object v1, p0, Lcom/join/mgps/fragment/e0;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/FriendCardFragment;->c0(Lcom/join/mgps/fragment/FriendCardFragment;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
