.class public final synthetic Lcom/join/mgps/activity/c0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/FriendActivity$g;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/FriendActivity$g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/c0;->b:Lcom/join/mgps/activity/FriendActivity$g;

    iput p2, p0, Lcom/join/mgps/activity/c0;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/c0;->b:Lcom/join/mgps/activity/FriendActivity$g;

    iget v1, p0, Lcom/join/mgps/activity/c0;->c:I

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/FriendActivity$g;->a(Lcom/join/mgps/activity/FriendActivity$g;ILandroid/view/View;)V

    return-void
.end method
