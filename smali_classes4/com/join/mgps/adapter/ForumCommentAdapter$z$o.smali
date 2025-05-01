.class public Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter$z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "o"
.end annotation


# instance fields
.field public a:Z

.field public b:Landroid/text/SpannableStringBuilder;

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLandroid/text/SpannableStringBuilder;ZLjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/text/SpannableStringBuilder;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;->a:Z

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;->b:Landroid/text/SpannableStringBuilder;

    .line 4
    iput-boolean p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;->c:Z

    .line 5
    iput-object p4, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;->e:Ljava/util/List;

    return-void
.end method
