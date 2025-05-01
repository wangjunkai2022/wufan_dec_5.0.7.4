.class Lcom/join/mgps/fragment/FriendAddFragment$a;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "FriendAddFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FriendAddFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

.field final synthetic b:Lcom/join/mgps/fragment/FriendAddFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FriendAddFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment$a;->b:Lcom/join/mgps/fragment/FriendAddFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/FriendAddFragment$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    return-object p1
.end method
