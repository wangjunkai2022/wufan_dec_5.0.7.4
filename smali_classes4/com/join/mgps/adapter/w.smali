.class public final synthetic Lcom/join/mgps/adapter/w;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/FriendListAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/FriendListAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/w;->b:Lcom/join/mgps/adapter/FriendListAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/adapter/w;->b:Lcom/join/mgps/adapter/FriendListAdapter;

    invoke-static {v0, p1}, Lcom/join/mgps/adapter/FriendListAdapter;->d(Lcom/join/mgps/adapter/FriendListAdapter;Landroid/view/View;)V

    return-void
.end method
