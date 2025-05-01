.class public Lcom/googlecode/mp4parser/h264/model/e;
.super Lcom/googlecode/mp4parser/h264/model/b;
.source "PictureParameterSet.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/h264/model/e$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:[I

.field public s:[I

.field public t:[I

.field public u:Z

.field public v:[I

.field public w:Lcom/googlecode/mp4parser/h264/model/e$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/model/b;-><init>()V

    return-void
.end method

.method public static b(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/e;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/read/b;

    invoke-direct {v0, p0}, Lcom/googlecode/mp4parser/h264/read/b;-><init>(Ljava/io/InputStream;)V

    .line 2
    new-instance p0, Lcom/googlecode/mp4parser/h264/model/e;

    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/model/e;-><init>()V

    const-string v1, "PPS: pic_parameter_set_id"

    .line 3
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    const-string v1, "PPS: seq_parameter_set_id"

    .line 4
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    const-string v1, "PPS: entropy_coding_mode_flag"

    .line 5
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 6
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    const-string v1, "PPS: pic_order_present_flag"

    .line 7
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 8
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    const-string v1, "PPS: num_slice_groups_minus1"

    .line 9
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 10
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    const/4 v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-lez v1, :cond_9

    const-string v1, "PPS: slice_group_map_type"

    .line 11
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 12
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    .line 13
    iget v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    add-int/lit8 v6, v5, 0x1

    new-array v6, v6, [I

    iput-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    add-int/lit8 v6, v5, 0x1

    .line 14
    new-array v6, v6, [I

    iput-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    add-int/lit8 v6, v5, 0x1

    .line 15
    new-array v6, v6, [I

    iput-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 16
    :goto_0
    iget v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    if-le v1, v5, :cond_0

    goto/16 :goto_5

    .line 17
    :cond_0
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    const-string v6, "PPS: run_length_minus1"

    .line 18
    invoke-virtual {v0, v6}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v6

    .line 19
    aput v6, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v1, v4, :cond_3

    const/4 v1, 0x0

    .line 20
    :goto_1
    iget v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    if-lt v1, v5, :cond_2

    goto/16 :goto_5

    .line 21
    :cond_2
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    const-string v6, "PPS: top_left"

    invoke-virtual {v0, v6}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v6

    aput v6, v5, v1

    .line 22
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    const-string v6, "PPS: bottom_right"

    .line 23
    invoke-virtual {v0, v6}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v6

    .line 24
    aput v6, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x3

    if-eq v1, v6, :cond_8

    const/4 v7, 0x4

    if-eq v1, v7, :cond_8

    const/4 v8, 0x5

    if-ne v1, v8, :cond_4

    goto :goto_4

    :cond_4
    if-ne v1, v2, :cond_9

    add-int/lit8 v1, v5, 0x1

    const/4 v8, 0x1

    if-le v1, v7, :cond_5

    goto :goto_2

    :cond_5
    add-int/2addr v5, v8

    if-le v5, v4, :cond_6

    const/4 v6, 0x2

    goto :goto_2

    :cond_6
    const/4 v6, 0x1

    :goto_2
    const-string v1, "PPS: pic_size_in_map_units_minus1"

    .line 25
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v5, v1, 0x1

    .line 26
    new-array v5, v5, [I

    iput-object v5, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    const/4 v5, 0x0

    :goto_3
    if-le v5, v1, :cond_7

    goto :goto_5

    .line 27
    :cond_7
    iget-object v7, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    .line 28
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "PPS: slice_group_id ["

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "]f"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 30
    invoke-virtual {v0, v6, v8}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v8

    aput v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    const-string v1, "PPS: slice_group_change_direction_flag"

    .line 31
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 32
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    const-string v1, "PPS: slice_group_change_rate_minus1"

    .line 33
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 34
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    :cond_9
    :goto_5
    const-string v1, "PPS: num_ref_idx_l0_active_minus1"

    .line 35
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 36
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    const-string v1, "PPS: num_ref_idx_l1_active_minus1"

    .line 37
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 38
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    const-string v1, "PPS: weighted_pred_flag"

    .line 39
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    const-string v1, "PPS: weighted_bipred_idc"

    .line 40
    invoke-virtual {v0, v4, v1}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v5

    long-to-int v1, v5

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    const-string v1, "PPS: pic_init_qp_minus26"

    .line 41
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    const-string v1, "PPS: pic_init_qs_minus26"

    .line 42
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    const-string v1, "PPS: chroma_qp_index_offset"

    .line 43
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v1

    .line 44
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    const-string v1, "PPS: deblocking_filter_control_present_flag"

    .line 45
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 46
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    const-string v1, "PPS: constrained_intra_pred_flag"

    .line 47
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 48
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    const-string v1, "PPS: redundant_pic_cnt_present_flag"

    .line 49
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 50
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    .line 51
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/read/a;->f()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 52
    new-instance v1, Lcom/googlecode/mp4parser/h264/model/e$a;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/h264/model/e$a;-><init>()V

    iput-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    const-string v5, "PPS: transform_8x8_mode_flag"

    .line 53
    invoke-virtual {v0, v5}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v5

    .line 54
    iput-boolean v5, v1, Lcom/googlecode/mp4parser/h264/model/e$a;->a:Z

    const-string v1, "PPS: pic_scaling_matrix_present_flag"

    .line 55
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 56
    :goto_6
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-boolean v1, v1, Lcom/googlecode/mp4parser/h264/model/e$a;->a:Z

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v2

    if-lt v3, v1, :cond_a

    goto :goto_8

    :cond_a
    const-string v1, "PPS: pic_scaling_list_present_flag"

    .line 57
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 58
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    const/16 v5, 0x8

    new-array v6, v5, [Lcom/googlecode/mp4parser/h264/model/f;

    iput-object v6, v1, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    new-array v5, v5, [Lcom/googlecode/mp4parser/h264/model/f;

    .line 59
    iput-object v5, v1, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    if-ge v3, v2, :cond_b

    const/16 v1, 0x10

    .line 60
    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/h264/model/f;->a(Lcom/googlecode/mp4parser/h264/read/b;I)Lcom/googlecode/mp4parser/h264/model/f;

    move-result-object v1

    .line 61
    aput-object v1, v6, v3

    goto :goto_7

    :cond_b
    add-int/lit8 v1, v3, -0x6

    const/16 v6, 0x40

    .line 62
    invoke-static {v0, v6}, Lcom/googlecode/mp4parser/h264/model/f;->a(Lcom/googlecode/mp4parser/h264/read/b;I)Lcom/googlecode/mp4parser/h264/model/f;

    move-result-object v6

    .line 63
    aput-object v6, v5, v1

    :cond_c
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 64
    :cond_d
    :goto_8
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    const-string v2, "PPS: second_chroma_qp_index_offset"

    .line 65
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v2

    .line 66
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/e$a;->c:I

    .line 67
    :cond_e
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/read/b;->v()V

    return-object p0
.end method

.method public static c([B)Lcom/googlecode/mp4parser/h264/model/e;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/model/e;->b(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lh1/b;

    invoke-direct {v0, p1}, Lh1/b;-><init>(Ljava/io/OutputStream;)V

    .line 2
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    const-string v1, "PPS: pic_parameter_set_id"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 3
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    const-string v1, "PPS: seq_parameter_set_id"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 4
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    const-string v1, "PPS: entropy_coding_mode_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 5
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    const-string v1, "PPS: pic_order_present_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 6
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    const-string v1, "PPS: num_slice_groups_minus1"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 7
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    const/4 v1, 0x6

    const/4 v2, 0x2

    const-string v3, "PPS: "

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez p1, :cond_9

    .line 8
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    const-string v6, "PPS: slice_group_map_type"

    invoke-virtual {v0, p1, v6}, Lh1/b;->o(ILjava/lang/String;)V

    new-array p1, v5, [I

    new-array v6, v5, [I

    new-array v7, v5, [I

    .line 9
    iget v8, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    if-nez v8, :cond_1

    const/4 p1, 0x0

    .line 10
    :goto_0
    iget v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    if-le p1, v6, :cond_0

    goto :goto_5

    .line 11
    :cond_0
    aget v6, v7, p1

    invoke-virtual {v0, v6, v3}, Lh1/b;->o(ILjava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    if-ne v8, v2, :cond_3

    const/4 v7, 0x0

    .line 12
    :goto_1
    iget v8, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    if-lt v7, v8, :cond_2

    goto :goto_5

    .line 13
    :cond_2
    aget v8, p1, v7

    invoke-virtual {v0, v8, v3}, Lh1/b;->o(ILjava/lang/String;)V

    .line 14
    aget v8, v6, v7

    invoke-virtual {v0, v8, v3}, Lh1/b;->o(ILjava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x3

    if-eq v8, p1, :cond_8

    const/4 v6, 0x4

    if-eq v8, v6, :cond_8

    const/4 v7, 0x5

    if-ne v8, v7, :cond_4

    goto :goto_4

    :cond_4
    if-ne v8, v1, :cond_9

    .line 15
    iget v7, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    add-int/lit8 v8, v7, 0x1

    if-le v8, v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/2addr v7, v5

    if-le v7, v2, :cond_6

    const/4 p1, 0x2

    goto :goto_2

    :cond_6
    const/4 p1, 0x1

    .line 16
    :goto_2
    iget-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    array-length v6, v6

    invoke-virtual {v0, v6, v3}, Lh1/b;->o(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 17
    :goto_3
    iget-object v7, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    array-length v8, v7

    if-le v6, v8, :cond_7

    goto :goto_5

    .line 18
    :cond_7
    aget v7, v7, v6

    invoke-virtual {v0, v7, p1}, Lh1/b;->l(II)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 19
    :cond_8
    :goto_4
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    const-string v6, "PPS: slice_group_change_direction_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 20
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    const-string v6, "PPS: slice_group_change_rate_minus1"

    invoke-virtual {v0, p1, v6}, Lh1/b;->o(ILjava/lang/String;)V

    .line 21
    :cond_9
    :goto_5
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    const-string v6, "PPS: num_ref_idx_l0_active_minus1"

    invoke-virtual {v0, p1, v6}, Lh1/b;->o(ILjava/lang/String;)V

    .line 22
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    const-string v6, "PPS: num_ref_idx_l1_active_minus1"

    invoke-virtual {v0, p1, v6}, Lh1/b;->o(ILjava/lang/String;)V

    .line 23
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    const-string v6, "PPS: weighted_pred_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 24
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    int-to-long v6, p1

    const-string p1, "PPS: weighted_bipred_idc"

    invoke-virtual {v0, v6, v7, v2, p1}, Lh1/b;->h(JILjava/lang/String;)V

    .line 25
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    const-string v6, "PPS: pic_init_qp_minus26"

    invoke-virtual {v0, p1, v6}, Lh1/b;->i(ILjava/lang/String;)V

    .line 26
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    const-string v6, "PPS: pic_init_qs_minus26"

    invoke-virtual {v0, p1, v6}, Lh1/b;->i(ILjava/lang/String;)V

    .line 27
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    const-string v6, "PPS: chroma_qp_index_offset"

    invoke-virtual {v0, p1, v6}, Lh1/b;->i(ILjava/lang/String;)V

    .line 28
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    const-string v6, "PPS: deblocking_filter_control_present_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 29
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    const-string v6, "PPS: constrained_intra_pred_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 30
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    const-string v6, "PPS: redundant_pic_cnt_present_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 31
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    if-eqz p1, :cond_11

    .line 32
    iget-boolean p1, p1, Lcom/googlecode/mp4parser/h264/model/e$a;->a:Z

    const-string v6, "PPS: transform_8x8_mode_flag"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 33
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-object p1, p1, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_6

    :cond_a
    const/4 p1, 0x0

    :goto_6
    const-string v6, "PPS: scalindMatrix"

    invoke-virtual {v0, p1, v6}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 34
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-object p1, p1, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    if-eqz p1, :cond_10

    const/4 p1, 0x0

    .line 35
    :goto_7
    iget-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-boolean v7, v6, Lcom/googlecode/mp4parser/h264/model/e$a;->a:Z

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v1

    if-lt p1, v7, :cond_b

    goto :goto_b

    :cond_b
    if-ge p1, v1, :cond_d

    .line 36
    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v6, v6, p1

    if-eqz v6, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v6, 0x0

    .line 37
    :goto_8
    invoke-virtual {v0, v6, v3}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 38
    iget-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v7, v6, p1

    if-eqz v7, :cond_f

    .line 39
    aget-object v6, v6, p1

    .line 40
    invoke-virtual {v6, v0}, Lcom/googlecode/mp4parser/h264/model/f;->b(Lh1/b;)V

    goto :goto_a

    .line 41
    :cond_d
    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    add-int/lit8 v7, p1, -0x6

    aget-object v6, v6, v7

    if-eqz v6, :cond_e

    const/4 v6, 0x1

    goto :goto_9

    :cond_e
    const/4 v6, 0x0

    .line 42
    :goto_9
    invoke-virtual {v0, v6, v3}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 43
    iget-object v6, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/e$a;->b:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v6, v6, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v8, v6, v7

    if-eqz v8, :cond_f

    .line 44
    aget-object v6, v6, v7

    .line 45
    invoke-virtual {v6, v0}, Lcom/googlecode/mp4parser/h264/model/f;->b(Lh1/b;)V

    :cond_f
    :goto_a
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    .line 46
    :cond_10
    :goto_b
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    iget p1, p1, Lcom/googlecode/mp4parser/h264/model/e$a;->c:I

    invoke-virtual {v0, p1, v3}, Lh1/b;->i(ILjava/lang/String;)V

    .line 47
    :cond_11
    invoke-virtual {v0}, Lh1/b;->k()V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 1
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 2
    :cond_2
    check-cast p1, Lcom/googlecode/mp4parser/h264/model/e;

    .line 3
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    iget-object v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 4
    :cond_3
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    if-eq v2, v3, :cond_4

    return v1

    .line 5
    :cond_4
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    if-eq v2, v3, :cond_5

    return v1

    .line 6
    :cond_5
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    if-eq v2, v3, :cond_6

    return v1

    .line 7
    :cond_6
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    if-eq v2, v3, :cond_7

    return v1

    .line 8
    :cond_7
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    if-nez v2, :cond_8

    .line 9
    iget-object v2, p1, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    if-eqz v2, :cond_9

    return v1

    .line 10
    :cond_8
    iget-object v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    .line 11
    :cond_9
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    if-eq v2, v3, :cond_a

    return v1

    .line 12
    :cond_a
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    if-eq v2, v3, :cond_b

    return v1

    .line 13
    :cond_b
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    if-eq v2, v3, :cond_c

    return v1

    .line 14
    :cond_c
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    if-eq v2, v3, :cond_d

    return v1

    .line 15
    :cond_d
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    if-eq v2, v3, :cond_e

    return v1

    .line 16
    :cond_e
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    if-eq v2, v3, :cond_f

    return v1

    .line 17
    :cond_f
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    if-eq v2, v3, :cond_10

    return v1

    .line 18
    :cond_10
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    if-eq v2, v3, :cond_11

    return v1

    .line 19
    :cond_11
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    iget-object v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    .line 20
    :cond_12
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    if-eq v2, v3, :cond_13

    return v1

    .line 21
    :cond_13
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    iget-boolean v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    if-eq v2, v3, :cond_14

    return v1

    .line 22
    :cond_14
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    if-eq v2, v3, :cond_15

    return v1

    .line 23
    :cond_15
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    iget-object v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-nez v2, :cond_16

    return v1

    .line 24
    :cond_16
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    if-eq v2, v3, :cond_17

    return v1

    .line 25
    :cond_17
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    iget-object v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-nez v2, :cond_18

    return v1

    .line 26
    :cond_18
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    iget v3, p1, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    if-eq v2, v3, :cond_19

    return v1

    .line 27
    :cond_19
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    iget-boolean p1, p1, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    if-eq v2, p1, :cond_1a

    return v1

    :cond_1a
    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    if-eqz v2, :cond_2

    const/16 v2, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v2, 0x4d5

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 9
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 10
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 11
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    if-eqz v2, :cond_4

    const/16 v2, 0x4cf

    goto :goto_4

    :cond_4
    const/16 v2, 0x4d5

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 13
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 14
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    if-eqz v2, :cond_5

    const/16 v2, 0x4cf

    goto :goto_5

    :cond_5
    const/16 v2, 0x4d5

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 15
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 16
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 17
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    if-eqz v2, :cond_6

    const/16 v2, 0x4cf

    goto :goto_6

    :cond_6
    const/16 v2, 0x4d5

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 18
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 19
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 20
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 21
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 22
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 23
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    if-eqz v1, :cond_7

    goto :goto_7

    :cond_7
    const/16 v3, 0x4d5

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PictureParameterSet{\n       entropy_coding_mode_flag="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       num_ref_idx_l0_active_minus1="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       num_ref_idx_l1_active_minus1="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       slice_group_change_rate_minus1="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       pic_parameter_set_id="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       seq_parameter_set_id="

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       pic_order_present_flag="

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       num_slice_groups_minus1="

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       slice_group_map_type="

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       weighted_pred_flag="

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->j:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       weighted_bipred_idc="

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       pic_init_qp_minus26="

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       pic_init_qs_minus26="

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       chroma_qp_index_offset="

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n       deblocking_filter_control_present_flag="

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->o:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       constrained_intra_pred_flag="

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->p:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       redundant_pic_cnt_present_flag="

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->q:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       top_left="

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->r:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n       bottom_right="

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->s:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n       run_length_minus1="

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->t:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n       slice_group_change_direction_flag="

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->u:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n       slice_group_id="

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->v:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n       extended="

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/e;->w:Lcom/googlecode/mp4parser/h264/model/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
