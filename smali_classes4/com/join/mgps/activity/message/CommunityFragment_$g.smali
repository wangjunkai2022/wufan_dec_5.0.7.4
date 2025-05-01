.class Lcom/join/mgps/activity/message/CommunityFragment_$g;
.super Ljava/lang/Object;
.source "CommunityFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/CommunityFragment_;->i0(IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/activity/message/CommunityFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/CommunityFragment_;IILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->e:Lcom/join/mgps/activity/message/CommunityFragment_;

    iput p2, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->b:I

    iput p3, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->c:I

    iput-object p4, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->e:Lcom/join/mgps/activity/message/CommunityFragment_;

    iget v1, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->b:I

    iget v2, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->c:I

    iget-object v3, p0, Lcom/join/mgps/activity/message/CommunityFragment_$g;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/activity/message/CommunityFragment_;->s0(Lcom/join/mgps/activity/message/CommunityFragment_;IILjava/lang/String;)V

    return-void
.end method
